package Week7._01_Monday;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Camry",2023,"White");
        Car car2 = new Car();
        System.out.println(Car.numberOfCars);
        System.out.println(car1);
        System.out.println(car2);
        car2.year = 2018;
        car2.setMake("BMW");
        car2.model = "X5";
        car2.color = "Black";
        System.out.println(car2);
        System.out.println(car2.getMake());
    }
}
