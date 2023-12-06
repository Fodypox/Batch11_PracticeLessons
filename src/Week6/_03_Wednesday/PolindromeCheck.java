package Week6._03_Wednesday;

import java.util.Arrays;

public class PolindromeCheck {
//    Hannah Anna
    public static boolean isPolindrome(String word){
        char[] letters = word.toCharArray();
        String reversedWord = "";
        for (int i = letters.length-1; i >= 0; i--) {

            reversedWord=reversedWord+letters[i];
        }
        return word.equals(reversedWord);
    }

    public static void main(String[] args) {
        String word1 = "sos";
        String word2 = "aslanbek";
        String word3 = "anna";
        System.out.println(isPolindrome(word1));
        System.out.println(isPolindrome(word2));
        System.out.println(isPolindrome(word3));
    }
}
