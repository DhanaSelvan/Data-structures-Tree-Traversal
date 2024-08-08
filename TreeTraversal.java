/**
 * TreeTraversal
 */
class node {
    int data;
    node left, right;
    node(int val){
        this.data = val;
        left = right = null;
    }
}
public class TreeTraversal {

    public void inorder(node root) {
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public void preorder(node root) {
        if(root == null) return;
        System.out.print(root.data + " ");    
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(node root) {
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.left.right.left = new node(8);
        root.right = new node(3);
        root.right.left = new node(6);
        root.right.right = new node(7);
        root.right.right.left = new node(9);
        root.right.right.right = new node(10);
        TreeTraversal tree = new TreeTraversal();
        System.out.println("Inorder ->"+ " ");
        tree.inorder(root);
        System.out.println("\nPreorder ->"+ " ");
        tree.preorder(root);
        System.out.println("\nPostorder ->"+ " ");
        tree.postorder(root);
        node tree2 = new node(4);
        tree2.left = new node(2);
        tree2.left.left = new node(3);
        tree2.left.left.right = new node(9);
        tree2.left.left.right.left = new node(1);
        tree2.right = new node(5);
        tree2.right.left = new node(7);
        tree2.right.right = new node(6);
        tree2.right.right.left = new node(8);
        System.out.println("\nInorder ->"+ " ");
        tree.inorder(tree2);
        System.out.println("\nPreorder ->"+ " ");
        tree.preorder(tree2);
        System.out.println("\nPostorder ->"+ " ");
        tree.postorder(tree2);
    }
}