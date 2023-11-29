package Week5._02_Tuesday;

public class HomeTask {
//    print fibonacci number sequence - 1 1 2 3 5 8
    public static void printFibonacci(int number){
        int start = 1;
        int end = 1;
        for (int i = 0; i < number; i++) {
            System.out.print(start+" "); // 1 1 2 3 5 8
            int temp = start + end; // 2 3
            start = end; // 1 2
            end = temp; // 2 3
        }


    }

    public static void main(String[] args) {
        printFibonacci(6);
    }
}
