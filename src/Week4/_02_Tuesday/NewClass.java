package Week4._02_Tuesday;

public class NewClass {
    public static int getRandom(int till){
        int random = (int) (Math.random()*till+1);
        return random;
    }

    public static void main(String[] args) {
        int myRandomNumber = getRandom(100);
        int anotherRandom = getRandom(50);
        System.out.println(myRandomNumber);
        System.out.println(anotherRandom);
    }
}
