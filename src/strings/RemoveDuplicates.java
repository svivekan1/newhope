package strings;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Sanjay.Vivekanandan on 14/07/2017.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        String inputString = "ABA";
        char[] inputArray = inputString.toCharArray();
        remove_duplicates(inputArray);

        for (char c : inputArray) {
            System.out.print(c);
            System.out.println();
        }
    }

    static void remove_duplicates(char[] str) {
        Set<Character> hashset =
                new LinkedHashSet<Character>();

        int write_index = 0;
        int read_index = 0;

        while (str[read_index] != '\0') {

            if (!hashset.contains(str[read_index])) {

                hashset.add(str[read_index]);
                str[write_index] = str[read_index];
                ++write_index;
            }

            ++read_index;
        }

        str[write_index] = '\0';
    }

}
