package HomeWork_2;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void showAnimal(){
        System.out.println("Это собака по имени:" + getName() + ", цветом:" + getColor());
    }
}
