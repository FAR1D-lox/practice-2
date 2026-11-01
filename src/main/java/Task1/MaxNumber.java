package Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.MIN_VALUE;
        while (length < 0) {
            System.out.print("Введите длину массива: ");
            if (scanner.hasNextInt()) {
                length = scanner.nextInt();
                if (length < 0)
                    System.out.println("Длина массива должна быть больше или равна нулю");
            } else {
                System.out.println("Введите корректное число");
                scanner.next(); //Страховка страховки ввода в сканер
            }
        }

        if (length == 0) {
            System.out.println("Массив пуст, чисел нет");
            return;
        }

        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Максимальное число по модулю: " + findMaxNumber(array));
    }

    private static int findMaxNumber(int[] array) {
        int maxNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            // Тип лонг, потому что диапазон int от -2147483648 до 2147483647.
            // -2147483648 останется тем же.
            if (Math.abs((long) maxNumber) < Math.abs((long) array[i]))
                maxNumber = array[i];
        }
        return maxNumber;
    }
}
