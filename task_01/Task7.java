package task_01;

public class Task7 {
    public static void main(String[] args) {
        // Створення масиву символів латинського алфавіту
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        // Виведення символів та їхніх кодів
        for (char letter : alphabet) {
            System.out.println(letter + " ==> " + (int) letter);
        }
    }
}
