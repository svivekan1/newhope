package strings;

/**
 * Created by Sanjay.Vivekanandan on 21/07/2017.
 */
public class FindPalindromes {

    public static void main(String[] args){
        String inputString = "aaba";
        System.out.println(find_all_palindrome_substrings_2(inputString));
    }

    public static int find_palindromes_in_sub_string(String input, int j, int k) {
        int count = 0;
        for (; j >= 0 && k < input.length(); --j, ++k) {
            if (input.charAt(j) != input.charAt(k)) {
                break;
            }
            System.out.print(input.substring(j, k+1) + ", ");
            count++;
        }
        return count;
    }

    public static int find_all_palindrome_substrings_2(String input) {
        int count = 0;
        for(int i = 0 ; i < input.length() ; ++i) {
            count+= find_palindromes_in_sub_string(input, i-1, i+1);// check for odd length palindromes
            count+= find_palindromes_in_sub_string(input, i, i+1);// check for even length palindromes
        }
        System.out.println();
        return count;
    }
}
