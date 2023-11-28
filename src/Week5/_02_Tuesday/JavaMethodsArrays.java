package Week5._02_Tuesday;

public class JavaMethodsArrays {
    public static int maxNumber(int[] numbers){
        int max = Integer.MIN_VALUE;
        for (int num:numbers) {
            if (max<num){
                max=num;
            }

        }
        return max;
    }

public static void main(String[] args) {
    int[] someNumbers = {7364,283,495,192,45984};
    int[] otherNumbers = {354,2781,483,18271,394};
    int maxNumber = maxNumber(someNumbers);
    System.out.println(maxNumber);
    System.out.println(maxNumber(someNumbers));
    System.out.println(maxNumber(otherNumbers));
    String someText = "I love Java";
    someText.length();
    String[] someTexts = {"apples","bananas","lemon"};
}
}
