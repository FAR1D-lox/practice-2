package Task2;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>(
                List.of(3.6, 4.2, 1.1, 10.9, 8.9, -1.5, 0.0)
        );

        System.out.println("До mergeSort: " + list);
        mergeSort(list, 0, list.size() - 1);
        System.out.println("После mergeSort: " + list);
    }

    public static void mergeSort(ArrayList<Double> list, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    private static void merge(ArrayList<Double> list, int left, int mid, int right) {
        ArrayList<Double> temp = new ArrayList<>();

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