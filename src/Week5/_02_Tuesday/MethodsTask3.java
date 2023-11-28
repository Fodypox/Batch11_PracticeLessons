package Week5._02_Tuesday;

public class MethodsTask3 {
//    positive or negative
//    public static void isPositive(int num){
//        if (num<0){
//            System.out.println("the number is negative");
//        }else {
//            System.out.println("The number is positive");
//        }
//    }
    public static boolean isPositive(int num){
        return num>=0;
    }

    public static void main(String[] args) {
        System.out.println(isPositive(6));
    }
}
