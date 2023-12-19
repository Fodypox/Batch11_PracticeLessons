package Week8._02_Tuesday;

public class PolindromeFinder {
    public static boolean isPolindrome(String word){
        StringBuilder reversedWord = new StringBuilder(word);
//        if (reversedWord.reverse().toString().equalsIgnoreCase(word)){
//            return true;
//        }else {
//            return false;
//        }
        return reversedWord.reverse().toString().equalsIgnoreCase(word);
    }
    public static void main(String[] args) {
        String word = "sos";
        String word2 = "java";
        System.out.println(isPolindrome(word));
        System.out.println(isPolindrome(word2));

    }
}
