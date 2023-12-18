package Week7._03_Wednesday;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("John Snow",8,"Male",75.6);
        System.out.println(student1);
        student1.setGender("female");
        System.out.println(student1);
    }
}
