package Week6._01_Monday;

public class MethodsOfTesting {
    public void calculateResult(int a, int b, String operation){
        if (operation.equals("multiplication")){
            System.out.println(a*b);
        }else if (operation.equals("sum")) {
            System.out.println(a+b);

        }
    }
}
