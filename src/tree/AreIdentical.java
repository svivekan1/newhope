package tree;

/**
 * Created by sanjay on 27/08/2017.
 */
public class AreIdentical {

    public static void main(String arg[]) {

        // root1
        Node root1 = new Node(100);
        Node x1 = new Node(50);
        Node y1 = new Node(200);
        root1.left = x1;
        root1.right = y1;
        root1.left.left = new Node(25);
        root1.right.left = new Node(125);
        root1.right.right = new Node(350);

        Node root2 = new Node(100);
        Node x2 = new Node(50);
        Node y2 = new Node(200);
        root2.left = x2;
        root2.right = y2;
        root2.left.left = new Node(25);
        root2.right.left = new Node(125);
        root2.right.right = new Node(350);
        System.out.println("Are trees identical : " + are_identical(root1,root2));

    }


    public static boolean are_identical(
            Node root1,
            Node root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 != null && root2 != null) {
            return ((root1.data == root2.data) &&
                    are_identical(root1.left, root2.left) &&
                    are_identical(root1.right, root2.right));
        }

        return false;
    }
}
