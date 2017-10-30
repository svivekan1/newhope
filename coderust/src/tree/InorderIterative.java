package tree;

import java.util.Stack;

/**
 * Created by sanjay on 27/08/2017.
 */
public class InorderIterative {

    public static void main(String arg[]) {
        Node root = new Node(100);
        Node x1 = new Node(50);
        Node y1 = new Node(200);
        root.left = x1;
        root.right = y1;
        root.left.left = new Node(25);
        root.left.right = new Node(75);
        root.left.left.right = new Node(35);

        inorder_iterative(root);
    }

    static void inorder_iterative(Node root)
    {
        if(root == null)
            return;

        Stack<Node> stk = new Stack<Node>();

        while(!stk.empty() || root != null)
        {
            if(root != null)
            {
                stk.push(root);
                root = root.left;
                continue;
            }

            System.out.print(stk.peek().data + " ");
            root = stk.pop().right;
        }
    }
}
