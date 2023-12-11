package HomeWork_2;

import java.util.Arrays;
import java.util.List;

public class Generic <T extends Animal> {
    private T obT;

    public Generic(T obT) {
        this.obT = obT;
    }

    public void animals(T obT) {

        Cat cat = new Cat("Sim", "Black");
        Dog dog = new Dog("Ben", "Grey");
        Horse horse = new Horse("Danny", "White");
        Parrot parrot = new Parrot("Popka", "Red-Green-Yellow");

        List<Animal> list = Arrays.asList(cat, dog, horse, parrot);
        for (Animal a: list) {
            a = obT;
            obT.showAnimal();
        }

    }
}

