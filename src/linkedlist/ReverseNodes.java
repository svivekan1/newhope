package linkedlist;

/**
 * Created by sanjay on 14/08/2017.
 */
public class ReverseNodes {

    public static void main(String[] args) {
        LinkedListImp mylist = new LinkedListImp();
        mylist.insertFirst(9);
        mylist.insertFirst(28);
        mylist.insertFirst(21);
        mylist.insertFirst(14);
        mylist.insertFirst(7);

        // call method
        LinkedListNode updatedList = reverse_even_nodes(mylist.returnList());
        mylist.displayList(updatedList);
    }

    // Helper function to merge two lists.
    public static LinkedListNode merge_alternating(
            LinkedListNode list1,
            LinkedListNode list2) {

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        LinkedListNode head = list1;

        while (list1.next != null &&
                list2 != null) {
            LinkedListNode temp = list2;
            list2 = list2.next;

            temp.next = list1.next;
            list1.next = temp;
            list1 = temp.next;
        }

        if (list1.next == null) {
            list1.next = list2;
        }

        return head;
    }

    public static LinkedListNode reverse_even_nodes(
            LinkedListNode head) {

        // Let's extract even nodes from the existing
        // list and create a new list consisting of
        // even nodes. We will push the even nodes at
        // head since we want them to be in reverse order.

        LinkedListNode curr = head;
        LinkedListNode list_even = null;

        while (curr != null &&
                curr.next != null) {
            LinkedListNode even = curr.next;
            curr.next = even.next;

            // Push at the head of new list.
            even.next = list_even;
            list_even = even;

            curr = curr.next;
        }

        // Now, merge the two lists
        // Original: 1,2,3,4,5
        // Modified original: 1,3,5
        // List_even: 4,2
        // Merged: 1,4,3,2,5

        return merge_alternating(head, list_even);
    }
}
