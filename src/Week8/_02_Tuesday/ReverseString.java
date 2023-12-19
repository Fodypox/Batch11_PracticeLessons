package Week8._02_Tuesday;

public class ReverseString {
    public static String reverseString1(String word){
        String reversedWord = "";
        char[] letters = word.toCharArray();
        for (int i = letters.length-1; i >= 0; i--) {
            reversedWord+=letters[i];
        }

        return reversedWord;
    }
    public static String reverseString2(String word){
        int length = word.length();
        char[] letters = word.toCharArray();
        int start = 0;
        int end = length-1;

        while (start<end){
            char temp = letters[start];
            letters[start] = letters[end];
            letters[end] = temp;
            start++;
            end--;
        }
        return new String(letters);
    }
    public static String reverseString3(String word){
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }
    public static void main(String[] args) {
        String word = "java";
        System.out.println(reverseString1(word));
        System.out.println(reverseString2(word));
        System.out.println(reverseString3(word));
    }
}
