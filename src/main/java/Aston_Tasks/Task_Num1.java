package Aston_Tasks;

import java.util.Scanner;

public class Task_Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввидите число: ");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}