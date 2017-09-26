package arrays;

public class BinarySearch {

    public static void main(String args[]) {
        int a[] = {10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Key found at element for iterative: " + binary_search_iterative(a, 5));
        System.out.println("Key found at element for recursive: " + bin_search(a, 5));
    }

    static int binary_search_iterative(int[] A, int key) {

        int low = 0;
        int high = A.length - 1;

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (A[mid] == key) {
                return mid;
            }

            if (key < A[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    static int binary_search_rec(int[] a, int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) / 2);
        if (a[mid] == key) {
            return mid;
        } else if (key < a[mid]) {
            return binary_search_rec(a, key, low, mid - 1);
        } else {
            return binary_search_rec(a, key, mid + 1, high);
        }
    }

    static int bin_search(int[] a, int key) {
        return binary_search_rec(a, key, 0, a.length - 1);
    }
}
