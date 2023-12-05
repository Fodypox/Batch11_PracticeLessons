package Week6._01_Monday;

public class CarMain {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota",2020,"White",2.5);
        System.out.println(toyota.engineVolume);
        toyota.startEngine();
        toyota.stopEngine();
        System.out.println(Car.numberOfCars);
        Car bmw = new Car("BMW",2023,"Black",4.0);
        System.out.println(Car.numberOfCars);
        Car mercedes = new Car("Mercedes",2023,"Black",4.0);
        System.out.println(Car.numberOfCars);
    }
}
