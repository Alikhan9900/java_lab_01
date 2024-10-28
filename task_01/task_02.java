package task_01;

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        System.out.println("Сума чисел: " + sum);

        scanner.close();
    }
}
