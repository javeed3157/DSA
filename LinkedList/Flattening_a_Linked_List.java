// Time:O(n)
// Space:O(1)
class GfG {
    class Node {
        int data;
        Node next;
        Node bottom;

        Node(int d) {
            data = d;
            next = null;
            bottom = null;
        }
    }

    Node flatten(Node root) {
        if (root.next == null || root == null) {
            return root;
        }
        root.next = flatten(root.next);
        root = mergeLists(root, root.next);

        return root;
    }

    Node mergeLists(Node a, Node b) {
        Node temp = new Node(0);
        Node res = temp;
        while (a != null || b != null) {
            if (a == null) {
                temp.bottom = b;
                break;
            }
            if (b == null) {
                temp.bottom = a;
                break;
            }
            if (a.data < b.data) {
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            } else {
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
        }
        return res.bottom;
    }

}

public class Flattening_a_Linked_List {

}
