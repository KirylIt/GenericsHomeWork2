package HomeWork_2;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void showAnimal(){
        System.out.println("Это кошка по имени:" + getName() + ", цветом:" + getColor());
    }
}
