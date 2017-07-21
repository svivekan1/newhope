package arrays;

import java.util.ArrayDeque;

/**
 * Created by Sanjay.Vivekanandan on 20/07/2017.
 */
public class ArrayStuff {


    public static void main(String args[])
    {
        int[] testArray = new int[] {3,1,8,2,7,5,3,4};

        //System.out.print(find_max_sliding_window(testArray,3));
        find_max_sliding_window(testArray,3);
    }

    public static void find_max_sliding_window(int[] array, int window_size) {

        if(array.length < window_size) {
            return;
        }

        ArrayDeque<Integer> window = new ArrayDeque<Integer>();

        //find out max for the first window
        for(int i=0 ; i<window_size ; i++) {


            while(!window.isEmpty()
                    && array[i] >= array[window.peekLast()] ) {
                window.removeLast();
            }

            window.addLast(i);
        }

        System.out.print(array[window.peekFirst()] + ", ");

        for(int i= window_size; i<array.length; i++) {

            // {3,1,8,2,7,5,3,4}
            // {0,1,2,3,4,5,6,7}

            int y = window.peekLast();
            System.out.print(y);

            //remove all numbers that are smaller than current number
            //from the tail of queue
            while(!window.isEmpty()
                    && array[i] >= array[window.peekLast()]) {
                window.removeLast();
            }

            int x = window.peekFirst();
            System.out.print(x);

            //remove first number if it doesn't fall in the window anymore
            if(!window.isEmpty()
                    && window.peekFirst() <= i - window_size) {
                window.removeFirst();
            }

            window.addLast(i);

            System.out.print(array[window.peekFirst()] + ", ");
        }

    }
}
