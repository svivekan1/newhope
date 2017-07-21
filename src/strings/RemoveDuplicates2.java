package strings;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Sanjay.Vivekanandan on 14/07/2017.
 */
public class RemoveDuplicates2 {

    public static void main(String[] args){
        String inputString = "abbabcddbabcdeedebc";
        char[] inputArray = inputString.toCharArray();
        remove_duplicates(inputArray);

        for (char c : inputArray){
            System.out.print(c);
            System.out.println();
        }
    }

    static void remove_duplicates(char[] str){
        if(str == null || str.length == 0) {
            return;
        }

        int write_index = 0;
        for(int i = 0; i < str.length; i++) {
            boolean found = false;

            for(int j = 0; j < write_index; j++) {
                if(str[i] == str[j]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                str[write_index] = str[i];
                write_index++;
            }
        }

        str[write_index] = '\0';
    }
}
