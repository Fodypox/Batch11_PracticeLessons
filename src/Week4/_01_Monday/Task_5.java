package Week4._01_Monday;

public class Task_5 {
    public static void main(String[] args) {
//           *
//          ***
//         *****
//        *******
//         *****
//          ***
//           *



        for (int j = 1; j <= 7; j=j+2) {
            System.out.println(" ".repeat((7-j)/2)+"*".repeat(j));
        }
        for (int i = 5; i >= 1; i=i-2) {
            System.out.println(" ".repeat((7-i)/2)+"*".repeat(i));
        }


    }
}
