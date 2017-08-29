package tree;

import java.util.Stack;

/**
 * Created by Sanjay.Vivekanandan on 29/08/2017.
 */
public class PrintTreePerimeter {

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
        display_tree_perimeter(root);
    }

    public static void print_left_perimeter(Node root) {
        while (root != null) {

            int curr_val = root.data;

            if (root.left != null) {
                root = root.left;
            }
            else if (root.right != null) {
                root = root.right;
            }
            else {
                break; // leaf node.
            }
            System.out.print(curr_val + " ");
        }
    }

    public static void print_right_perimeter(Node root) {
        // stack for right side values.
        Stack<Integer> r_values = new Stack<Integer>();

        while (root != null) {

            int curr_val = root.data;

            if (root.right != null) {
                root = root.right;
            }
            else if (root.left != null) {
                root = root.left;
            }
            else {
                break; // leaf node.
            }

            r_values.push(curr_val);
        }

        while (!r_values.isEmpty()) {
            System.out.print(r_values.pop() + " ");
        }
    }

    public static void print_leaf_nodes(Node root) {
        if (root != null) {
            print_leaf_nodes(root.left);
            print_leaf_nodes(root.right);

            if (root.left == null &&
                    root.right == null) {
                System.out.print(root.data + " ");
            }
        }
    }

    public static void display_tree_perimeter(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");

            print_left_perimeter(root.left);

            if (root.left != null ||
                    root.right != null) {
                // We don't need to print if root is also the leaf node.
                print_leaf_nodes(root);
            }

            print_right_perimeter(root.right);
        }
    }
}
