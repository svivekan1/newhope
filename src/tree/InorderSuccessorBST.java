package tree;

/**
 * Created by Sanjay.Vivekanandan on 24/08/2017.
 */
public class InorderSuccessorBST {

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
        System.out.println("Inorder Successor: " + inorder_successor_bst(root,75));
    }

    static Node find_min(
            Node root) {

        if (root == null)
            return null;

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    static int inorder_successor_bst(
            Node root,
            int d) {

        if (root == null) {
            return -1;
        }

        Node successor = null;

        while (root != null) {

            if (root.data < d) {
                root = root.right;
            } else if (root.data > d) {
                successor = root;
                root = root.left;
            } else {
                if (root.right != null) {
                    successor = find_min(root.right);
                }
                break;
            }
        }
        return successor.data;
    }

    public static void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
    }
}
