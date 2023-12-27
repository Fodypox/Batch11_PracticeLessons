package Week9.Wednesday;

public class Triangle extends Shape{
    public double height;
    public double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.height*this.width/2;
    }
}
