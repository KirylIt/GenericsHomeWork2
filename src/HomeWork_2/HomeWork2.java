package HomeWork_2;

import java.sql.Time;

public class HomeWork2 {
    public static void main(String[] args) {
        // Задача 2.
        // Создайте класс Animal и несколько классов-наследников.
        // Далее создайте обобщённый класс, который ограничен extends Animal.
        // В обобщённом методе вам необходимо в качестве параметра T принимать различные
        // подклассы животных и выводить название животного и его цвет.

        Animal cat = new Cat("Tom", "Black");
        Animal dog = new Dog("Ben", "Grey");
        Animal horse = new Horse("Danny", "White");
        Animal parrot = new Parrot("Bob", "Red-Green-White");

        Generic<Animal> generic =new Generic<>();
        generic.animals(cat);
        generic.animals(dog);
        generic.animals(horse);
        generic.animals(parrot);

    }
}
