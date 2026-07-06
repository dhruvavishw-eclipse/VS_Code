



     
     
   import java.util.*;
i

public class RecipeRearrangement{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        
        // Read shuffled list
        br.readLine();  // "shuffled"
        List<String> shuffled = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            shuffled.add(br.readLine().trim());
        }
        
        // Read original list
        br.readLine();  // "original"
        List<String> original = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            original.add(br.readLine().trim());
        }
        
        // Find minimum operations
        int result = findMinOperations(n, shuffled, original);
        System.out.println(result);
    }
    
    public static int findMinOperations(int n, List<String> shuffled, List<String> original) {
        // Convert lists to arrays for easier manipulation
        String[] initialState = shuffled.toArray(new String);
        String[] targetState = original.toArray(new String);
        
        // BFS to find minimum operations
        Queue<StateWithOps> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        
        String initialKey = arrayToString(initialState);
        String targetKey = arrayToString(targetState);
        
        // Check if already in order
        if (initialKey.equals(targetKey)) {
            return 0;
        }
        
        queue.add(new StateWithOps(initialState.clone(), 0));
        visited.add(initialKey);
        
        while (!queue.isEmpty()) {
            StateWithOps current = queue.poll();
            String[] currentArray = current.state;
            int ops = current.ops;
            
            // Try all possible cut-and-ins

        }


