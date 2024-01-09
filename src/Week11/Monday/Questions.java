package Week11.Monday;

import java.util.ArrayList;
import java.util.Arrays;

public class Questions {
    public static void sumOfNumbers(int a, int b){
        System.out.println(a+b);
    }
    public static void sumOfNumbers(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {

//        String word1 = "hell";
//        String word2 = "hello";
//        System.out.println((word1+"o")==word2);
//        System.out.println((word1+"o").equals(word2));
//        sumOfNumbers(1,2);
//        sumOfNumbers(1,2,3);
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(23,21,343,45,23));

//        try {
//            System.out.println(numbers.get(4));
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Out of bound try another index");
//        }finally {
//            System.out.println("I work all the time");
//        }

        for (int i = 0; i < 20; i++) {
            System.out.print(">");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    /**
     * What is the difference between == and .equals() in Java?
     * Explain the concept of method overloading and method overriding in Java with examples.
     * How does exception handling work in Java? Explain the try-catch-finally blocks.
     * What are the different types of loops in Java? Can you explain when to use each one?*/
}
