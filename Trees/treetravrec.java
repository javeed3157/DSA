// Time:O(n)
// Space:O(n)
// DFS
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class treetravrec {
    Node root;
    void preorder(Node n){ //Root, left, right
        if(n == null){
            return;
        }
        System.out.print(n.val + " ");
        preorder(n.left);
        preorder(n.right);
    }
    void inorder(Node n){ //left, Root, right
        if(n == null){
            return;
        }
        preorder(n.left);
        System.out.print(n.val + " ");
        preorder(n.right);
    }
    void postorder(Node n){ //left, right, Root
        if(n == null){
            return;
        }
        preorder(n.left);
        preorder(n.right);
        System.out.print(n.val + " ");
    }
    public static void main(String[] args) {
        treetravrec tree = new treetravrec();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
        System.out.println();
    }
}
