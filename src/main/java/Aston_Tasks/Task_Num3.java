package Aston_Tasks;

public class Task_Num3 {
    public static void main(String[] args) {
        int[] numbers = { 55, 43, 18, 91, 33, 12, 28, 87 };

        System.out.println("Элементы массива кратные 3:");
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}