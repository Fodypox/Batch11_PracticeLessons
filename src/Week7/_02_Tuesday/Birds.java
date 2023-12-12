package Week7._02_Tuesday;

public class Birds extends Animal{
    private String color;
    public Birds(String type, int age, String color) {
        super(type, age);
        this.color = color;
    }

    public void flying(){
        System.out.println("Bird is flying");
    }

    public void eating(){
        System.out.println("Bird is eating");
    }

    @Override
    public String toString() {
        return "Birds{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
