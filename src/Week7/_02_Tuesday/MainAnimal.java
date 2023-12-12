package Week7._02_Tuesday;

public class MainAnimal {
    public static void main(String[] args) {
        Animal elephant = new Animal("Elephant",5);
        elephant.eating();
        elephant.setAge(6);
        System.out.println(elephant.getAge());
        Birds bird = new Birds("Bird",3,"Blue");
        System.out.println(bird);
        bird.flying();
        bird.eating();

//        Fish class extends from animal
//        boolean isOcean
//        override eating
//        create swimming
    }
}
