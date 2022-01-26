// Time:
// Enqueue:O(1)
// Dequeue:O(n)
// Peek:O(1)
public class Qarr {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int size){
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void enqueue(int data){
            if(rear == size - 1){
                System.out.println("Queue is full");
                return;
            }
            rear += 1;
            arr[rear] = data;
        }

        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i + 1];
            }
            rear -= 1;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.dequeue();
        }
    }
}
