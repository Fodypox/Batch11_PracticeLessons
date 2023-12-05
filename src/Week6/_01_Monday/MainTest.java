package Week6._01_Monday;

public class MainTest {
    public static void main(String[] args) {
        MethodsOfTesting methods = new MethodsOfTesting();
        int num1 = 57;
        int num2 = 32;

        System.out.print("the sum of num1 and num2 is ");
        methods.calculateResult(num1,num2,"sum");

        System.out.print("the multiplication of num1 and num2 is ");
        methods.calculateResult(num1,num2,"multiplication");
    }
}
