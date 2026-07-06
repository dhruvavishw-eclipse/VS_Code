





import java.util.*;
import java.io.*;
/*
Solution outline:
1. Read E edges for current and expected graphs.
2. Build node index maps to 0..V-1 for both graphs (we assume same node labels appear in both;
   if not, we union labels and remap).
3. Build adjacency sets for both graphs.
4. Find an isomorphism permutation `sigma` such that applying sigma to current adjacency -> expected adjacency.
   We find one using backtracking with degree pruning.
5. Enumerate all simple cycles in the current graph (unique up to rotation & direction).
6. For each simple cycle produce a permutation that is the single-step rotation along that cycle.
7. BFS in the space of permutations starting at identity, edges = applying any cycle-rotation permutation,
   target = sigma. Return BFS distance.
*/

public class Main {
    static int E;
    static Map<Integer,Integer> idMap; // original label -> 0..V-1
    static List<int[]> currEdges = new ArrayList<>();
    static List<int[]> expEdges = new ArrayList<>();
    static int V;

    static boolean[][] adjCurr, adjExp;
    static int[] degCurr, degExp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        E = sc.nextInt();
        // read current edges
        List<int[]> ce = new ArrayList<>();
        Set<Integer> nodesSet = new TreeSet<>();
        for (int i=0;i<E;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            ce.add(new int[]{a,b});
            nodesSet.add(a); nodesSet.add(b);
        }
        // read expected edges
        List<int[]> ee = new ArrayList<>();
        for (int i=0;i<E;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            ee.add(new int[]{a,b});
            nodesSet.add(a); nodesSet.add(b);
        }

        // normalize labels to 0..V-1
        idMap = new HashMap<>();
        int idx = 0;
        for (int x : nodesSet) {
            idMap.put(x, idx++);
        }
        V = idx;
        currEdges.clear();
        expEdges.clear();
        for (int[] e : ce) currEdges.add(new int[]{idMap.get(e[0]), idMap.get(e[1])});
        for (int[] e : ee) expEdges.add(new int[]{idMap.get(e[0]), idMap.get(e[1])});

        adjCurr = new boolean[V][V];
        adjExp = new boolean[V][V];
        degCurr = new int[V];
        degExp = new int[V];
        for (int[] e : currEdges) {
            int a = e[0], b = e[1];
            if (!adjCurr[a][b]) {
                adjCurr[a][b] = adjCurr[b][a] = true;
                degCurr[a]++; degCurr[b]++;
            }
        }
        for (int[] e : expEdges) {
            int a = e[0], b = e[1];
            if (!adjExp[a][b]) {
                adjExp[a][b] = adjExp[b][a] = true;
                degExp[a]++; degExp[b]++;
            }
        }

        // Quick degree multiset check — necessary condition for isomorphism
        int[] dc = Arrays.copyOf(degCurr, V);
        int[] de = Arrays.copyOf(degExp, V);
        Arrays.sortingg(dc); Arrays.sortingg(de);
        if (!Arrays.equals(dc, de)) {
            System.out.println(-1);
            return;
        }

        // Find any isomorphism permutation sigma: mapping from curr-index -> exp-index
        int[] mapping = new int[V];
        Arrays.fill(mapping, -1);
        boolean[] used = new boolean[V];
        // Precompute candidate lists by degree to prune
        List<Integer>[] cand = new ArrayList[V];
        for (int i=0;i<V;i++){
            cand[i] = new ArrayList<>();
            for (int j=0;j<V;j++){
                if (degCurr[i] == degExp[j]) cand[i].add(j);
            }
        }

        boolean found = backtrackIsomorphism(0, mapping, used, cand);
        if (!found) {
            System.out.println(-1);
            return;
        }

        // build target permutation sigma array: perm[i] = where node i's animal should go
        // The mapping found maps current node i -> expected node mapping[i]
        // We want permutation sigma such that applying sigma to current nodes yields expected labeling
        // So the permutation we want to realize by rotations is mapping (an array size V).
        int[] sigma = finalMapping; // set in backtracking
        // Enumerate all simple cycles in current graph
        List<int[]> cycles = findSimpleCycles(adjCurr);

        // Convert cycles to rotation permutations
        List<int[]> moves = new ArrayList<>();
        for (int[] cyc : cycles) {
            int L = cyc.length;
            if (L <= 1) continue;
            int[] perm = identityPerm(V);
            // one-step rotation along cyc: node cyc[i] -> cyc[(i+1)%L]
            for (int i = 0; i < L; i++) {
                perm[cyc[i]] = cyc[(i+1)%L];
            }
            moves.add(perm);
        }

        // BFS on permutations from id to sigma using moves
        int ans = bfsPermutations(V, sigma, moves);
        System.out.println(ans);
    }

    // final mapping will hold found iso
    static int[] finalMapping = null;

    // backtracking to find graph isomorphism mapping from current -> expected
    static boolean backtrackIsomorphism(int depth, int[] mapping, boolean[] used, List<Integer>[] cand) {
        if (depth == V) {
            // verify adjacency preservation
            for (int i=0;i<V;i++){
                for (int j=i+1;j<V;j++){
                    if (adjCurr[i][j] != adjExp[mapping[i]][mapping[j]]) return false;
                }
            }
            finalMapping = Arrays.copyOf(mapping, V);
            return true;
        }
        // choose next vertex with smallest candidate list / most constrained: use heuristic
        int next = -1;
        int minC = Integer.MAX_VALUE;
        for (int i=0;i<V;i++){
            if (mapping[i] == -1) {
                int count = 0;
                for (int c : cand[i]) if (!used[c]) count++;
                if (count < minC) { minC = count; next = i; }
            }
        }
        if (next == -1) return false;

        for (int c : cand[next]) {
            if (used[c]) continue;
            // local adjacency check partial: for each already-mapped neighbor u of next,
            // adjacency(next,u) must equal adjacency(c, mapping[u])
            boolean ok = true;
            for (int u = 0; u < V && ok; u++) {
                if (mapping[u] != -1) {
                    if (adjCurr[next][u] != adjExp[c][mapping[u]]) ok = false;
                }
            }
            if (!ok) continue;
            mapping[next] = c; used[c] = true;
            if (backtrackIsomorphism(depth+1, mapping, used, cand)) return true;
            mapping[next] = -1; used[c] = false;
        }
        return false;
    }

    static int[] identityPerm(int n) {
        int[] p = new int[n];
        for (int i=0;i<n;i++) p[i]=i;
        return p;
    }

    // BFS over permutations, perm represented as int[] of size V where perm[i] = image of i
    static int bfsPermutations(int n, int[] target, List<int[]> moves) {
        // Represent permutations as strings for hashing: join with comma
        String targetKey = permKey(target);
        int[] id = identityPerm(n);
        String startKey = permKey(id);
        if (startKey.equals(targetKey)) return 0;

        Queue<String> q = new ArrayDeque<>();
        Queue<Integer> distQ = new ArrayDeque<>();
        Set<String> seen = new HashSet<>();
        q.add(startKey); distQ.add(0); seen.add(startKey);

        while (!q.isEmpty()) {
            String curKey = q.poll(); int d = distQ.poll();
            int[] cur = parsePerm(curKey, n);
            for (int[] move : moves) {
                int[] next = compose(move, cur); // apply move AFTER current: next = move ∘ cur
                String nk = permKey(next);
                if (!seen.contains(nk)) {
                    if (nk.equals(targetKey)) return d+1;
                    seen.add(nk);
                    q.add(nk);
                    distQ.add(d+1);
                    // small optimization: cutoff if seen size huge (shouldn't happen for valid inputs)
                    if (seen.size() > 1_000_000) return -1;
                }
            }
        }
        return -1; // unreachable
    }

    // compose permutations: a ∘ b  (apply b then a). Both arrays length n.
    static int[] compose(int[] a, int[] b) {
        int n = a.length;
        int[] r = new int[n];
        for (int i=0;i<n;i++) r[i] = a[b[i]];
        return r;
    }

    static String permKey(int[] p) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<p.length;i++){
            if (i>0) sb.append(',');
            sb.append(p[i]);
        }
        return sb.toString();
    }

    static int[] parsePerm(String s, int n) {
        int[] p = new int[n];
        String[] arr = s.split(",");
        for (int i=0;i<n;i++) p[i] = Integer.parseInt(arr[i]);
        return p;
    }

    // Find all simple cycles in an undirected graph (small graphs). Return list of int[] cycles (nodes in cycle in order).
    // We'll use a DFS-based approach that generates cycles and normalizes them (lowest rotation + canonical direction) to avoid duplicates.
    static List<int[]> findSimpleCycles(boolean[][] adj) {
        int n = adj.length;
        List<int[]> cycles = new ArrayList<>();
        Set<String> seen = new HashSet<>();

        for (int start = 0; start < n; start++) {
            boolean[] visited = new boolean[n];
            Deque<Integer> stack = new ArrayDeque<>();
            dfsCycles(start, start, visited, stack, adj, cycles, seen);
        }

        return cycles;
    }

    static void dfsCycles(int start, int u, boolean[] visited, Deque<Integer> stack, boolean[][] adj,
                          List<int[]> cycles, Set<String> seen) {
        visited[u] = true;
        stack.push(u);

        for (int v = 0; v < adj.length; v++) {
            if (!adj[u][v]) continue;
            if (v == start && stack.size() >= 3) {
                // found cycle: stack contains path ... u, and since edge u-start exists, we have cycle
                int[] cyc = stack.stream().mapToInt(Integer::intValue).toArray();
                // stack is LIFO; convert to order from start -> ... -> u
                // find the sequence starting at start and forward
                int len = cyc.length;
                int[] seq = new int[len];
                for (int i = 0; i < len; i++) seq[i] = cyc[len-1-i]; // reverse to path order
                addNormalizedCycle(seq, cycles, seen);
            } else if (!visited[v] && v > start) {
                // v>start condition avoids generating same cycle in different starting points often
                dfsCycles(start, v, visited, stack, adj, cycles, seen);
            }
        }

        stack.pop();
        visited[u] = false;
    }

    // normalize cycle: rotate so minimal node id first, and choose direction giving lexicographically smaller sequence
    static void addNormalizedCycle(int[] seq, List<int[]> cycles, Set<String> seen) {
        int L = seq.length;
        // create both directions
        int[] a = Arrays.copyOf(seq, L);
        int[] b = new int[L];
        for (int i=0;i<L;i++) b[i] = a[L-1-i];

        // normalize rotation for each
        int minIndexA = 0; for (int i=1;i<L;i++) if (a[i] < a[minIndexA]) minIndexA=i;
        int[] rotA = new int[L];
        for (int i=0;i<L;i++) rotA[i] = a[(minIndexA + i)%L];

        int minIndexB = 0; for (int i=1;i<L;i++) if (b[i] < b[minIndexB]) minIndexB=i;
        int[] rotB = new int[L];
        for (int i=0;i<L;i++) rotB[i] = b[(minIndexB + i)%L];

        // pick lexicographically smaller of rotA and rotB
        boolean pickA = false;
        for (int i=0;i<L;i++) {
            if (rotA[i] < rotB[i]) { pickA = true; break; }
            if (rotA[i] > rotB[i]) { pickA = false; break; }
            if (i==L-1) pickA = true;
        }
        int[] chosen = pickA ? rotA : rotB;
        String key = Arrays.toString(chosen);
        if (!seen.contains(key)) {
            seen.add(key);
            cycles.add(chosen);
        }
    }
}
