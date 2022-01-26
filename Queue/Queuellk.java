// Time:
// Enqueue:O(1)
// Dequeue:O(1)
// Peek:O(1)
public class Queuellk {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty(){
        return head == null && tail == null;
    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int num = head.data;
        if(head == tail){
            tail = null;
        }
        head = head.next;
        return num;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        Queuellk queue = new Queuellk();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.peek());
        while(!queue.isEmpty()){
            System.out.print(queue.peek() + " ");
            queue.dequeue();
        }
    }
}
