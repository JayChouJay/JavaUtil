package algorithm.a1array.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickStandardSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int partPoint = partition(arr, low, high);
        quickSort(arr, low, partPoint - 1);
        quickSort(arr, partPoint + 1, high);
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static int partition(int[] arr, int low, int high) {
        int leader = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= leader) high--;
            arr[low] = arr[high];
            while (low < high && arr[low] <= leader) low++;
            arr[high] = arr[low];
        }
        arr[low] = leader;
        return low;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 1, 2, 9, 3, 8, 7, 5};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
