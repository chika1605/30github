import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя первого числа
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        // Запрос у пользователя операции
        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Запрос у пользователя второго числа
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result;

        // Выполнение выбранной операции
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: некорректный оператор!");
                return;
        }

        // Вывод результата
        System.out.println("Результат: " + result);

        scanner.close();
    }
}
