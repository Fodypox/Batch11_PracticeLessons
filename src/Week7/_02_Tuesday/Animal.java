package Week7._02_Tuesday;

public class Animal {
    private String type;
    private int age;

    public Animal(String type, int age){
        this.type = type;
        this.age = age;
    }

    public void eating(){
        System.out.println("animal is eating");
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
