package dynamic;

/**
 * Created by Sanjay.Vivekanandan on 07/09/2017.
 */
public class MaxSum {

    public static void main(String args[]) {
        int a[] = {1, -1, 6, -4, 2, 2};

        System.out.println("Max is: " + find_max_sum_nonadjacent(a));
    }

    static int find_max_sum_nonadjacent(int[] a) {
        if (a == null || a.length == 0) {
            return 0;
        }

        if (a.length == 1) {
            return a[0];
        }

        int[] result = new int[a.length];

        result[0] = a[0];
        for (int i = 1; i < a.length; i++) {

            result[i] = Math.max(a[i], result[i - 1]);

            if (i - 2 >= 0) {
                result[i] = Math.max(result[i], a[i] + result[i - 2]);
            }
        }
        return result[a.length - 1];
    }
}
