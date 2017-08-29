package tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Sanjay.Vivekanandan on 29/08/2017.
 */
public class LevelOrderTraversalOfBinaryTree {


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
        level_order_traversal(root);
    }

    // Using one queue
    public static void level_order_traversal(
            Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> current_queue =
                new ArrayDeque<Node>();

        Node dummyNode = new Node(0);

        current_queue.add(root);
        current_queue.add(dummyNode);

        while (!current_queue.isEmpty()) {
            Node temp = current_queue.poll();
            System.out.print(temp.data + ",");

            if (temp.left != null) {
                current_queue.add(temp.left);
            }

            if (temp.right != null) {
                current_queue.add(temp.right);
            }

            if (current_queue.peek() == dummyNode) {
                System.out.println();

                current_queue.remove();

                if (!current_queue.isEmpty()) {
                    current_queue.add(dummyNode);
                }
            }
        }
        System.out.println();
    }
}
