package tree;

/**
 * Created by Sanjay.Vivekanandan on 21/08/2017.
 */
public class App {

    public static Node root;

    public static void main(String arg[]) {
        Node root = new Node(100);
        Node x1 = new Node(50);
        Node y1 = new Node(200);
        root.left = x1;
        root.right = y1;
        root.left.left = new Node(25);
        root.left.right = new Node(110);
        root.right.left = new Node(125);
        root.right.right = new Node(350);
        System.out.println("Original Tree : ");
        display(root);
    }

    public static void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
    }
}
