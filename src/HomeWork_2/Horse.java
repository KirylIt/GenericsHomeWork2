package HomeWork_2;

public class Horse extends Animal {
    public Horse(String name, String color) {
        super(name, color);
    }
    @Override
    public void showAnimal(){
        System.out.println("Это лошадь по имени:" + getName() + ", цветом:" + getColor());
    }
}
