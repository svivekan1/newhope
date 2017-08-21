package tree;

/**
 * Created by Sanjay.Vivekanandan on 21/08/2017.
 */

public class IsBinarySearchTree {

    static Node prev = null;

    static Node root;

    public static void main(String arg[]) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(100);
        b.insert(50);
        b.insert(20);
        b.insert(125);
        b.insert(200);
        b.insert(125);
        b.insert(350);
        System.out.println("Original Tree : ");
        b.display(b.root);
        System.out.println("---\n###");
        System.out.println("BST: " + is_binary_search_tree(b.root));
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
}
