package HomeWork_1;

public class Average <T extends Number>{
    private T[] array;

    public Average (T[] array){
        this.array = array.clone();
    }

    public double average() {
        double sum = 0.0;

        for (T value: array) {
            sum += value.doubleValue();
        }
        return sum;
    }
    boolean sameAvg(Average<?> ob){
        return average() == ob.average();
    }
}
