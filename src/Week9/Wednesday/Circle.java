package Week9.Wednesday;

public class Circle extends Shape{
    public double radius;
    public final double Pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Pi*this.radius*this.radius;
    }
}
