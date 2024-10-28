public class task_03 {
    public static void main(String[] args) {
        // Перевірка, що є хоча б один аргумент
        if (args.length > 0) {
            // Об'єднання аргументів в один рядок з пробілами між ними
            String result = String.join(" ", args);
            // Виведення результату в консоль
            System.out.println(result);
        }
    }
}




