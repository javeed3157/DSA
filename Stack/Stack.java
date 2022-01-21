// push, pop, peek takes O(1) time complexity

public class Stack {
    Node head;
    private int size;
    Stack(){
        size = 0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        size += 1;
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        size -= 1;
        return top;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.size);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
