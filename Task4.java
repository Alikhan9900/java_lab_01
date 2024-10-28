
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int number2 = scanner.nextInt();

        int gcd = findGCD(number1, number2);
        System.out.println("Найбільший спільний дільник: " + gcd);

        scanner.close();
    }

    // Метод для обчислення НСД за допомогою алгоритму Евкліда
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
