package Task1;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {
        int[] array = new int[] {1, 4, 2, -9, 7};

        if (array.length == 0) {
            System.out.println("Массив пуст");
            return;
        }
        else {
            System.out.println("Массив: " + Arrays.toString(array));
        }

        System.out.println("Максимальное число по модулю: " + findMaxNumber(array));
    }

    private static int findMaxNumber(int[] array) {
        int maxNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (Math.abs(maxNumber) < Math.abs(array[i]))
                maxNumber = array[i];
        }
        return maxNumber;
    }
}
