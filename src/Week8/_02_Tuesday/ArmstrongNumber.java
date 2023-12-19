package Week8._02_Tuesday;

public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int number){
        int originalNum, remainder, result = 0, n = 0;
        originalNum=number;
//        Count number of digits
        while (originalNum != 0){
            originalNum/=10;
            ++n;
        }
        originalNum = number;
        while (originalNum != 0){
            remainder = originalNum%10;
            remainder+=Math.pow(remainder,n);
            originalNum/=10;
        }
        return result==number;
    }
    public static void main(String[] args) {
//        153 = 1^3+5^3+3^3
        System.out.println(isArmstrongNumber(153));
    }
}
