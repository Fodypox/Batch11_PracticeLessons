package Week7._01_Monday;

public class mainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("toyota",2018);
        System.out.println(vehicle.type);
        System.out.println(vehicle.year);

        Vehicle vehicle2 = new Vehicle("Honda", 2020);
        System.out.println(vehicle2.type);
        System.out.println(vehicle2.year);

        Vehicle vehicle3 = new Vehicle("BMW");
        System.out.println(vehicle3.type);
        System.out.println(vehicle3.year);
        vehicle3.year = 2023;
        System.out.println(vehicle3.year);
        System.out.println(vehicle3);
    }
}
