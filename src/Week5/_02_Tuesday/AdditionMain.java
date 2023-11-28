package Week5._02_Tuesday;

public class AdditionMain {
    public static void main(String[] args) {
        MethodsTask1 newObject = new MethodsTask1();
        newObject.a = 5;
        int sumOfNumbers = newObject.sum(9,3);
        System.out.println(sumOfNumbers);
    }
}
