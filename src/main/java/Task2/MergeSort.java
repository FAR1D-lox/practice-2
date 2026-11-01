package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

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
                scanner.next();
            }
        }

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            list.add(random.nextDouble());
        }

        List<Double> listBeforeSort = List.copyOf(list);

        mergeSort(list, 0, list.size() - 1);
        System.out.println("До mergeSort: " + listBeforeSort);
        System.out.println("После mergeSort: " + list);
    }

    public static void mergeSort(List<Double> list, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    private static void merge(List<Double> list, int left, int mid, int right) {
        List<Double> temp = new ArrayList<>(right - left + 1);

        int i = left;
        int j = mid + 1;

        while (i <= mid && j <= right) {
            if (list.get(i) <= list.get(j)) {
                temp.add(list.get(i));
                i++;
            } else {
                temp.add(list.get(j));
                j++;
            }
        }

        while (i <= mid) {
            temp.add(list.get(i));
            i++;
        }

        while (j <= right) {
            temp.add(list.get(j));
            j++;
        }

        for (int k = 0; k < temp.size(); k++) {
            list.set(left + k, temp.get(k));
        }
    }
}