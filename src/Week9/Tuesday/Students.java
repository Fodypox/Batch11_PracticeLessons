package Week9.Tuesday;

public class Students {
    public String name;
    public static int count;

    public Students(String name) {
        this.name = name;
        count++;
    }

    public void studentIsStudying(){
        System.out.println(this.name + " is studying");
    }

    public static void generalInformation(){
        System.out.println("We have "+count+" students in our school");

    }
}
