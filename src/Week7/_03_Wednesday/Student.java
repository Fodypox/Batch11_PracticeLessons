package Week7._03_Wednesday;

public class Student {
//    Encapsulation - is a process of hiding data.
//    It is a main concept of Object Oriented Programming
    private String name;
    private int grade;
    private String gender;
    private double gpa;

    public Student(String name, int grade, String gender, double gpa) {
        this.name = name;
        this.grade = grade;
        this.gender = gender;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female")){
            this.gender = gender;
        }

    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
