package Week8._01_Monday;

public class InheritanceTopic {
//    to inherit all variables and methods from parent or super class to subclass or child class
}
abstract class Person{
    String name;
    int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public void helloMethod(){
        System.out.println("hello");
    }
    public abstract void someMethod();
}
class Teacher extends Person{
    String subject;
    String school;

    public Teacher(String name, int yearOfBirth, String subject, String school) {
        super(name, yearOfBirth);
        this.subject = subject;
        this.school = school;
    }

    @Override
    public void someMethod() {

    }
}
class Engineer extends Person{
    public Engineer(String name, int yearOfBirth) {
        super(name, yearOfBirth);
    }

    @Override
    public void helloMethod() {
        System.out.println("Hi there");
    }

    @Override
    public void someMethod() {

    }
}

class mainClass{
    public static void main(String[] args) {
        Engineer engineer1 = new Engineer("John Smith",1985);
        Teacher teacher = new Teacher("Dumbledor",1867,"Magic","Hogwards");
        engineer1.helloMethod();
        teacher.helloMethod();
    }
}
