package Week4._01_Monday;

public class Task_1 {
    public static void main(String[] args) {
//        * * * *
//        * * * *
//        * * * *
//        * * * *
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

        int size = 7;
        for (int i = 1; i <= size; i++) {
            if (i%2==1){
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
            }
            else {
//                for (int j = 0; j < size; j++) {
//                    if (j==0||j==size-1){
//                        System.out.print("*");
//                    }else {
//                        System.out.print(" ");
//                    }
//                }
                System.out.print("*"+" ".repeat(size-2)+"*");
                }
            System.out.println();
            }
        }


    }

