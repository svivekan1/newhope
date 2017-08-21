package tree;

/**
 * Created by Sanjay.Vivekanandan on 21/08/2017.
 */
public class App {

    public static Node root;

    public static void main(String arg[]) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(100);
        b.insert(50);
        b.insert(20);
        b.insert(75);
        b.insert(200);
        b.insert(125);
        b.insert(350);
        System.out.println("Original Tree : ");
        b.display(b.root);
//        System.out.println("");
//        System.out.println("Check whether Node with value 4 exists : " + b.find(4));
//        System.out.println("Delete Node with no children (2) : " + b.delete(2));
//        b.display(root);
//        System.out.println("\n Delete Node with one child (4) : " + b.delete(4));
//        b.display(root);
//        System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));
//        b.display(root);
    }
}
