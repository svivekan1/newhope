package linkedlist;

import java.util.HashSet;

/**
 * Created by sanjay on 13/08/2017.
 */
public class LinkedListImp {
    private LinkedListNode first;
    private LinkedListNode last;
    public LinkedListImp(){

    }

    public boolean isEmpty(){
        return (first == null);
    }

    // used to insert at the beginning of the list
    public void insertFirst(int data){
        LinkedListNode newLinkedListNode = new LinkedListNode();
        newLinkedListNode.data = data;
        newLinkedListNode.next = first;
        first = newLinkedListNode;
    }

    public LinkedListNode deleteFirst(){
        LinkedListNode temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first --> last) ");
        LinkedListNode current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void insertLast(int data){
        LinkedListNode current = first;
        while(current.next != null){
            current = current.next; // we'll loop until current.next is null
        }
        LinkedListNode newLinkedListNode = new LinkedListNode();
        newLinkedListNode.data = data;
        current.next = newLinkedListNode;
    }

    public LinkedListNode returnList(){
        LinkedListNode current = first;
        while(current != null){
            current = current.next;
        }
        return first;
    }

    public void displayList(LinkedListNode head){
        System.out.println("List (first --> last) ");
        LinkedListNode current = head;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

}
