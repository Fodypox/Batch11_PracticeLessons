package Week4._01_Monday;

public class Task_2 {
    public static void main(String[] args) {
//        *         -> 1st row 1 stars
//        * *       -> 2nd row 2 stars
//        * * *     -> 3rd row 3 stars
//        * * * *   -> 4th row 4 stars
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
