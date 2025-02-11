import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод числа
        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();

        // Проверяем, что число неотрицательное
        if (number < 0) {
            System.out.println("Факториал можно вычислить только для неотрицательных чисел.");
        } else {
            // Вычисляем факториал
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            // Выводим результат
            System.out.println("Факториал числа " + number + " равен: " + factorial);
        }

        // Закрываем сканер
        scanner.close();
    }
}
