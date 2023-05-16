package algorithm.a1array.sort;

public class C1Sort {
    //冒泡排序：从小到大
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //冒泡排序:指定顺序（flag:true从小到大，false从大到小）
    public static void bubble(int[] array, boolean flag) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (flag && array[j] > array[j + 1] || !flag && array[j] < array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
    }

    //低级选择排序：从小到大
    public static void selectSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[arr.length - 1 - i]) {
                    int temp = arr[j];
                    arr[j] = arr[arr.length - 1 - i];
                    arr[arr.length - 1 - i] = temp;
                }
            }
        }
    }

    //选择排序：从小到大
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (compare(arr[j + 1], arr[maxIndex])) {
                    maxIndex = j + 1;
                }
            }
            change(arr, maxIndex, arr.length - 1 - i);
        }
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
