// Time:O(n)
// Space:O(1)
public class LLRev {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void reverse(){

        if(head == null || head.next == null){
            return;
        }
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev; 

            // Update our prev and curr nodes
            prev = curr;
            curr = nextNode;
        }
        head.next = null;
        head = prev;
    }

    public Node recursivereverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = recursivereverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        LLRev list = new LLRev();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.reverse();
        list.printList();

        list.head = list.recursivereverse(list.head);
        list.printList();

        // System.out.println(list.head.data);
    }

}
