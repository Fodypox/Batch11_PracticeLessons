package Week6._01_Monday;

public class Car {
    String make;
    int year;
    String color;
    double engineVolume;
    static int numberOfCars;

    public Car(String make, int year, String color, double engineVolume) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.engineVolume = engineVolume;
        numberOfCars++;
    }

    public void startEngine(){
        System.out.println("the engine has been started");
    }
    public void stopEngine(){
        System.out.println("we arrived");
    }

}
