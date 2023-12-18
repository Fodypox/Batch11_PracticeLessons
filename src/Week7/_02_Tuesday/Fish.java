package Week7._02_Tuesday;

public class Fish extends Animal{
    private boolean isOcean;

    public Fish(String type, int age, boolean isOcean) {
        super(type, age);
        this.isOcean = isOcean;
    }

    public boolean isOcean() {
        return isOcean;
    }

    public void setOcean(boolean ocean) {
        isOcean = ocean;
    }

    @Override
    public void eating() {
        System.out.println("Fish is eating");
    }

    public void swimming(){
        if (this.isOcean()){
            System.out.println("The fish is swimming in the Ocean");
        }else {
            System.out.println("The fish is swimming in a river");
        }
    }

}
