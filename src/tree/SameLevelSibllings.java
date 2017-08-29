package tree;

/**
 * Created by Sanjay.Vivekanandan on 29/08/2017.
 */
public class SameLevelSibllings {

    private static NodeWithSibling connect_next_level(NodeWithSibling head) {
        NodeWithSibling current = head;
        NodeWithSibling next_level_head = null;
        NodeWithSibling prev = null;

        while (current != null) {
            if (current.left != null && current.right != null) {
                if (next_level_head == null) {
                    next_level_head = current.left;
                }

                current.left.next = current.right;

                if (prev != null) {
                    prev.next = current.left;
                }

                prev = current.right;
            } else if (current.left != null) {
                if (next_level_head == null) {
                    next_level_head = current.left;
                }

                if (prev != null) {
                    prev.next = current.left;
                }

                prev = current.left;
            } else if (current.right != null) {
                if (next_level_head == null) {
                    next_level_head = current.right;
                }

                if (prev != null) {
                    prev.next = current.right;
                }

                prev = current.right;
            }

            current = current.next;
        }

        if (prev != null) {
            prev.next = null;
        }

        return next_level_head;
    }

    public static void populate_sibling_pointers(NodeWithSibling root) {

        if (root == null) {
            return;
        }

        root.next = null;

        do {

            root = connect_next_level(root);
        } while (root != null);
    }
}
