public class LLhw {
    Node head;
    private int size;
    LLhw(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            size += 1;
        }
    }
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

    public void delgt25(){
        
        Node curr = head;
        Node pre = null;
        for(int i = 1; i <= 50; i++){
            if(curr.data > 25){
                if(pre == null){
                    head = head.next;
                }
                else{
                    Node temp = curr.next;
                    pre.next = temp;
                }
            }
            else{
                pre = curr;
            }
            curr = curr.next;
        }
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
    public static void main(String[] args) {
        LLhw list = new LLhw();
        for(int i = 1; i < 51; i++){
            list.addLast(i);
        }
        list.printList();
        list.delgt25();
        list.printList();
    }
}
