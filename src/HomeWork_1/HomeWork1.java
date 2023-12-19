package HomeWork_1;

public class HomeWork1 {
    public static void main(String[] args) {
        // Задача 1. (+)
        // Создайте обобщённый конструктор, который принимает два параметра: T и V.
        // В конструкторе необходимо сравнить классы этих двух параметров и предусмотреть
        // соответствующий вывод результата в консоли.

        Average<Integer, Integer> average = new Average<>(11, 35);
        Average<Long, Integer> average1 = new Average<>(24l, 36);

        System.out.println(average.equals(average1));
    }
}
