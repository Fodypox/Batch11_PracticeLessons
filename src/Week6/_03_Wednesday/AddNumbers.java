package Week6._03_Wednesday;

public class AddNumbers {
    public static int countAdd(int[] numbers){
        int count = 0;
        for (int num:numbers) {
            if (num%2==1){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {6354,83,95,9384,874,58};
        System.out.println(countAdd(a));
    }
}
