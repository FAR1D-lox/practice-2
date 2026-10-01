import Task1.MaxNumber;
import Task2.MergeSort;
import Task3.StreamAPI;
import Task4.SyncHttpClient;
import Task5.Timer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Практическая работа");
        System.out.println("1 - Задание 1 (Максимум по модулю)");
        System.out.println("2 - Задание 2 (MergeSort)");
        System.out.println("3 - Задание 3 (Stream API)");
        System.out.println("4 - Задание 4 (HTTP GET запрос IP)");
        System.out.println("5 - Задание 5 (Таймер обратного отсчета)");
        System.out.print("Выберите номер задания для запуска: ");

        System.out.println();

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Запуск Задания 1\n");
                MaxNumber.main(args);
                break;
            case 2:
                System.out.println("Запуск Задания 2\n");
                MergeSort.main(args);
                break;
            case 3:
                System.out.println("Запуск Задания 3\n");
                StreamAPI.main(args);
                break;
            case 4:
                System.out.println("Запуск Задания 4\n");
                SyncHttpClient.main(args);
                break;
            case 5:
                System.out.println("Запуск Задания 5\n");
                Task5.Main.main(args);
                break;
            default:
                System.out.println("Неверный ввод.");
        }
    }
}