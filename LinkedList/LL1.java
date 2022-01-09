// Insert --> O(1)
// Search --> O(n)

public class LL1{
    Node head;
    private int size;
    LL1(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size += 1;
        }
    }
    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // add Last
    public void addLast(String data){
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

    // Insert at specified index
    public void addInd(int ind, String data){
        if(ind > size || ind < 0){
            System.out.println("Invalid index");
            return;
        }
        size+=1;

        Node newNode = new Node(data);
        if(head == null || ind == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curr = head;
        for(int i = 1; i < size; i++){
            if(i == ind){
                Node temp = curr.next;
                curr.next = newNode;
                newNode.next = temp;
                break;
            }
            curr = curr.next;
        }
    }

    // print list
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

    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size -= 1;
        head = head.next;
    }

    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size -= 1;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Delete at specified index
    public void delInd(int ind){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(ind > size || ind < 0){
            System.out.println("Invalid index");
            return;
        }
        size -= 1;
        if(ind == 0){
            head = head.next;
            return;
        }
        Node currNode = head;
        for(int i = 1; i < size; i++){
            if(ind == i){
                Node temp = currNode.next.next;
                currNode.next = temp;
                break;
            }
            currNode = currNode.next;
        }
    }
    // get size
    public void getSize(){
        System.out.println(size);
        // int count = 0;
        // if(head == null){
        //     System.out.println(0);
        //     return;
        // }
        // Node currNode = head;
        // while(currNode != null){
        //     count += 1;
        //     currNode = currNode.next;
        // }
        // System.out.println(count);
    }
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.getSize();

        list.addFirst("this");
        list.printList();
        list.getSize();

        list.addInd(3, "list");
        list.printList();

        list.delInd(2);
        list.printList();
    }
}