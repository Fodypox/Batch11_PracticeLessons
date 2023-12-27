package Week9.Wednesday;

public class MainShapes {
    public static void main(String[] args) {
        Shape circle = new Circle(3.5);
        Shape rectangle = new Rectangle(2.5,3.5);
        Shape triangle = new Triangle(5,6);
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());
    }
}
