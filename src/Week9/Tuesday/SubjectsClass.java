package Week9.Tuesday;

public class SubjectsClass {
    public String subjectName;
    public static Students students = new Students("John Smith");
    public static void subjectClassStudents(){
        System.out.println(students.name);
    }
}
