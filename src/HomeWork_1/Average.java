package HomeWork_1;

public class Average <T extends Number, V extends Number>{
    private T number;
    private V numbers;

    public Average(T number, V numbers) {
        this.number = number;
        this.numbers = numbers;
        System.out.println("Сравнение number & numbers: " + (number.getClass() == numbers.getClass()));
    }

    public boolean equals(Average obj) {
        return number.getClass() == obj.number.getClass()
                && numbers.getClass() == obj.numbers.getClass();
    }
}
