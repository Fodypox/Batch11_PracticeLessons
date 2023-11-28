package Week5._02_Tuesday;

public class MethodsTask4 {
//    print numbers from 1 to n
    public static void printNumbers(int number){
//        1 2 3 4 5 6
        for (int i = 1; i <= number; i++) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        printNumbers(6);
    }
}
