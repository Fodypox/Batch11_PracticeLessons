package Week9.Tuesday;

public class MainMethodClass {
    public static void main(String[] args) {
//        StaticKeyWord skw = new StaticKeyWord();
//        skw.nameOfObject = "object name";
//        StaticKeyWord.name = "New Name of class";
//
//        System.out.println(StaticKeyWord.name);

        Students student1 = new Students("Alex Crown");
        System.out.println(student1.name);
        System.out.println(Students.count);
        Students student2 = new Students("Lara Croft");
        System.out.println(student2.name);
        System.out.println(Students.count);
        student1.studentIsStudying();
        student2.studentIsStudying();
        Students.generalInformation();
        SubjectsClass.subjectClassStudents();
    }
}
