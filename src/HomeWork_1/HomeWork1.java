package HomeWork_1;

public class HomeWork1 {
    public static void main(String[] args) {
        // Задача 1. (+)
        // Создайте обобщённый конструктор, который принимает два параметра: T и V.
        // В конструкторе необходимо сравнить классы этих двух параметров и предусмотреть
        // соответствующий вывод результата в консоли.

        Integer[] intArray = {12, 15, 33, 45, 50};
        Average<Integer> iob = new Average<>(intArray);
        System.out.println("Сумма для Integer: " + iob.average());

        Double[] doubleArray = {12.0, 15.0, 33.0, 45.0, 50.0};
        Average<Double> dob = new Average<>(doubleArray);
        System.out.println("Сумма для Double: " + dob.average());

        Float[] floatArray = {12.0F, 15.0F, 33.5F, 45.0F, 50.0F};
        Average<Float> fob = new Average<>(floatArray);
        System.out.println("Сумма для Double: " + fob.average());

        System.out.println(" Сумма iob и dob: ");
        if (iob.sameAvg(dob))
            System.out.println(" Равно!");
        else
            System.out.println(" Не равно!");

        System.out.println(" Сумма iob и fob: ");
        if (iob.sameAvg(fob))
            System.out.println(" Равно!");
        else
            System.out.println(" Не равно!");

    }
}
