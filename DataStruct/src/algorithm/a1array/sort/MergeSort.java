package algorithm.a1array.sort;

import java.util.Arrays;

public class MergeSort {
    //归并排序入口
    public int[] mergeSort(int[] arr) {
        if (arr == null) return null;
        mergeSort(arr, 0, arr.length - 1);
        return null;
    }

    public int[] mergeSort(int[] arr, int begin, int end) {
        if (end - begin > 2) {
            //TODO:归并排序，技术点：递归。没学会
            int[] resultA = mergeSort(arr, begin, begin + (end - begin) / 2);
            int[] resultb = mergeSort(arr, begin + (end - begin) / 2, end);
            return arrSort(resultA, resultb);
        } else if (end - begin == 1) return Arrays.copyOfRange(arr, begin, end);
        else if (arr[begin + 1] - arr[begin] > 0) return new int[]{arr[begin], arr[begin + 1]};
        else return new int[]{arr[begin + 1], arr[begin]};
    }

    public int[] arrSort(int[] arr1, int[] arr2) {
        //TODO:归并排序没学会
        return null;
    }

    public static boolean compare(int val1, int val2) {
        //如果 前面的数i>后面的数j
        if (val1 > val2) {
            return true;
        }
        return false;
    }

    public static void change(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
