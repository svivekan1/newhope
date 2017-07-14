package strings;

/**
 * Created by Sanjay.Vivekanandan on 13/07/2017.
 */
public class ReverseString {


    public static void main(String[] args){
         String inputString = "HELLOWORLD!";
         char[] inputArray = inputString.toCharArray();
         reverse_words(inputArray);

        for (char c : inputArray){
            System.out.print(c);
            System.out.println();
        }
    }

    // Null terminating strings are not used in java
    // however for this question assume you are passed a null terminated string
    public static void str_rev(char[] str, int start, int end) {
        if (str == null || str.length < 2) {
            return;
        }

        while (start < end) {

            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }
    }

    public static void reverse_words (char[] sentence) {

        // Here sentence is a null-terminated string ending with char '\0'.

        if (sentence == null || sentence.length == 0 || sentence[0] == '\0') {
            return;
        }

        // To reverse all words in the string, we will first reverse
        // the string. Now all the words are in the desired location, but
        // in reverse order: "Hello World" -> "dlroW olleH".

        int len = sentence.length;
        str_rev(sentence, 0, len-1);

        // Now, let's iterate the sentence and reverse each word in place.
        // "dlroW olleH" -> "World Hello"

        int start = 0;
        int end;
        while (true) {
            // find the  start index of a word while skipping spaces.
            while (sentence[start] == ' ') {
                ++start;
            }

            if (sentence[start] == '\0') {
                break;
            }

            // find the end index of the word.
            end = start+1;
            if(end >= sentence.length-1){
                break;
            }
            while (sentence[end] != '\0' && sentence[end] != ' ') {
                ++end;
            }


            // let's reverse the word in-place.
            str_rev (sentence, start, end-1);

            start = end;
        }
    }
}
