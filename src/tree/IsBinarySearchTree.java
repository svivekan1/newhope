package tree;

/**
 * Created by Sanjay.Vivekanandan on 21/08/2017.
 */

public class IsBinarySearchTree {

    static Node prev = null;

    static Node root;

    public static void main(String arg[]) {
        Node root = new Node(100);
        Node x1 = new Node(50);
        Node y1 = new Node(200);
        root.left = x1;
        root.right = y1;
        root.left.left = new Node(25);
        root.left.right = new Node(75);
        root.right.left = new Node(125);
        root.right.right = new Node(350);
        System.out.println("Original Tree : ");
        display(root);
        System.out.println("---\n###");
        System.out.println("BST: " + is_binary_search_tree(root));
    }

    public static boolean is_binary_search_tree(Node root) {

        if (root == null) {
            return true;
        }

        if (!is_binary_search_tree(root.left)) {
            return false;
        }

        if (prev != null && prev.data >= root.data) {
            return false;
        }
        prev = root;

        if (!is_binary_search_tree(root.right)) {
            return false;
        }

        return true;
    }

    public static void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
    }
}
