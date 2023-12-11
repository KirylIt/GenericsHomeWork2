package HomeWork_2;

public class Parrot extends Animal{
    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    void showAnimal(){
        System.out.println("Это попугай по имени:" + getName() + ", цветом:" + getColor());
    }
}
