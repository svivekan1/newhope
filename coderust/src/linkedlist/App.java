package linkedlist;

/**
 * Created by sanjay on 13/08/2017.
 */
public class App {

    public static void main(String[] args) {
        LinkedListImp mylist = new LinkedListImp();
        mylist.insertFirst(9);
        mylist.insertFirst(28);
        mylist.insertFirst(21);
        mylist.insertFirst(14);
        mylist.insertFirst(7);

        mylist.displayList();

//        LinkedListNode newList = mylist.returnList();
//        mylist.displayList(newList);

    }
}
