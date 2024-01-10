package Week11.Wednesday;

public class Student {
    public static int numberOfStudents;
    public String name;

    public Student(String name) {
        this.name = name;
        numberOfStudents++;
    }
    public static void someMethod(){
        System.out.println(numberOfStudents);
    }
}
class mainStudent{
    public static void main(String[] args) {
        Student student1 = new Student("John");
        Student student2 = new Student("Merry");
        System.out.println(student1.name);
        System.out.println(Student.numberOfStudents);
    }


}
