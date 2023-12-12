package Week7._01_Monday;

public class Vehicle {

    String type;
    int year;

    public Vehicle(String type, int year) {
        this.type = type;
        this.year = year;
    }
    public Vehicle(){

    }
    public Vehicle(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Our vehicle " +
                "type is " + type +
                ", and year is " + year;
    }
}
