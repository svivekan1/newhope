package linkedlist;

import java.util.HashSet;

/**
 * Created by sanjay on 13/08/2017.
 */
public class App {

    public static void main(String[] args) {
        LinkedListImp mylist = new LinkedListImp();
        mylist.insertFirst(100);
        mylist.insertFirst(50);
        mylist.insertFirst(99);
        mylist.insertFirst(88);
        mylist.insertLast(9999999);

        mylist.displayList();

        LinkedListNode newList = mylist.returnList();
        mylist.displayList(newList);

    }
}
