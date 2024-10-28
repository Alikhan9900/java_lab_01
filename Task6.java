
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів у послідовності Фібоначчі: ");
        int n = scanner.nextInt();

        // Створення масиву Фібоначчі
        int[] fibonacciArray = new int[n];
        fibonacciArray[0] = 1;
        if (n > 1) {
            fibonacciArray[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        // Створення масиву у зворотній послідовності
        int[] reversedArray = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArray[i] = fibonacciArray[n - 1 - i];
        }

        // Виведення обох масивів
        System.out.println("Масив Фібоначчі:");
        for (int num : fibonacciArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Зворотний масив Фібоначчі:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
