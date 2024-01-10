package Week11.Wednesday;

import java.util.Arrays;

public class FindOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {12,32,34,211,44245,894,123,343,16};
        int[] newArray = findOddNumbers(numbers);
        System.out.println(Arrays.toString(newArray));
        String name = "Aslanbek";
        System.out.println(reverseString(name));
        System.out.println(findMax(numbers));
    }
    public static int[] findOddNumbers(int[] arr) {
        int lengthCount = 0;
        for (int num:arr) {
            if (num%2==1){
                lengthCount++;
            }
        }
        int [] newNumbers = new int[lengthCount];
        // Implementation to find and return an array of odd numbers from 'arr'
        int index = 0;
        for (int num:arr) {

            if (num%2==1){
                newNumbers[index] = num;
                index++;
            }
        }
        return newNumbers;
    }

    public static String reverseString(String input) {
        // Implementation to reverse the string 'input' and return the reversed string
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public boolean isPalindrome(String input) {
        // Implementation to check if 'input' is a palindrome; return true or false accordingly
//        Anna = annA
//        StringBuilder sb = new StringBuilder(input);
//        return sb.reverse().toString().equals(input);
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int findMax(int[] arr) {
        // Implementation to find and return the maximum element in 'arr'
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }



}
