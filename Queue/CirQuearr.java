// Time:
// Enqueue:O(1)
// Dequeue:O(1)
// Peek:O(1)
public class CirQuearr {
    static class CirQueue{
        static int size;
        static int arr[];
        static int rear = -1;
        static int front = -1;
        CirQueue(int size){
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFill(){
            return (rear + 1) % size == front;
        }

        public static void enqueue(int data){
            if(isFill()){
                System.out.println("Queue is full");
                return;
            }

            // For first element add
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int removed = arr[front];
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front + 1) % size;
            }
            return removed;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        CirQueue q = new CirQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        q.enqueue(4);
        System.out.println(q.dequeue());
        q.enqueue(5);
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.dequeue();
        }
    }
}
