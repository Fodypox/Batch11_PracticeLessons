package Week9.Wednesday.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        Animal sun = new Dog();
        Animal tom = new Cat();
        Animal paharo = new Bird();
        List<Animal> animals = new ArrayList<>();
        animals.add(sun);
        animals.add(tom);
        animals.add(paharo);
        for (Animal animal:animals) {
            animal.makeSound();
        }

    }



}
