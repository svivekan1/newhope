package linkedlist;

import java.util.HashSet;

/**
 * Created by Sanjay.Vivekanandan on 08/08/2017.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        // Create LinkedListNode
        LinkedListImp mylist = new LinkedListImp();
        mylist.insertFirst(100);
        mylist.insertFirst(100);
        mylist.insertFirst(99);
        mylist.insertFirst(88);
        mylist.insertLast(9999999);

        // call method
        LinkedListNode updatedList = remove_duplicates(mylist.returnList());
        mylist.displayList(updatedList);
    }

    public static LinkedListNode remove_duplicates(LinkedListNode head) {
        if (head == null) {
            return head;
        }

        // Let's track list values in a hash table.
        HashSet<Integer> dup_set = new HashSet<Integer>();
        LinkedListNode curr = head;
        dup_set.add(curr.data);

        while (curr.next != null) {
            if (!dup_set.contains(curr.next.data)) {
                // Element not found in map, let's add it.
                dup_set.add(curr.next.data);
                curr = curr.next;
            } else {
                // Duplicate node found. Let's remove it from the list.
                curr.next = curr.next.next;
            }
        }
        return head;
    }
}
