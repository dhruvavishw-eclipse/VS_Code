import java.util.*;
public class QueueCirArrDS {

    public static class CircularQueue{
        int front=-1;
        int rear=-1;
        int size=0;
        int arr []=new int[7];
         
        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is full");
            }
            else if(size==0){
                front =rear=0;
                arr[0]=val;
            }
            else if(rear<arr.length-1){
                arr[++rear]=val;
            }
            else if (rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
            size++;
        }


        public int remove()throws Exception {
            if(size==0){
                throw new Exception("Queue is Empty!");
            }

            else if(front==arr.length-1){
                int val=arr[front];
                front=0;
                size--;
                return val;
            }
            else{
                int val=arr[front];
                front++;
                size--;
                return val;
            }
           
        }


        public int peek() throws Exception {          
            if(size==0){
                throw new Exception ("Queue is Empty!");
            }
            else{
                return arr[front];
            }
        }


        public boolean isEmpty() {
            if(size==0) return true;
            else return false;
        }


        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return ;
            }
            else if(front<rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{ // Rear < Front
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
          System.out.println();
        }
        
    }

    public static void main(String BKP[])throws Exception{
      CircularQueue cQ=new CircularQueue();
      cQ.display();
    cQ.add(3);
    cQ.add(5);
    cQ.add(7);
    cQ.add(11);
    cQ.add(13);
    cQ.add(17);
    cQ.display();
      System.out.println(cQ.peek());
      cQ.remove();
      cQ.remove();
      cQ.add(19);
      System.out.println(cQ.peek());
      cQ.display();
      cQ.add(23);
      cQ.remove();
      cQ.add(29);
      cQ.add(31);
    //   cQ.add(37);
      cQ.display();

      for(int i=0;i<cQ.arr.length;i++){
        System.out.print(cQ.arr[i]+" ");
      }
           
    }
}
