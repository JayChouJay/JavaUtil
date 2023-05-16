package algorithm.a1array.util;

import algorithm.Tool;
import org.junit.jupiter.api.Test;

public class B1ArrayOperate {
    private int[] arr1 = {1, 3, 5, 9, 13, 14, 19, 25, 31};
    private int[] arr2 = {12, 24, 24, 32, 42, 52, 62, 64};

    //有序数组合并
    public int[] mergeArr(int[] arr1, int[] arr2) {
        if (arr1 == null) return arr2;
        if (arr2 == null) return arr1;

        int[] resultArr = new int[arr1.length + arr2.length];
        int p1 = 0;
        int p2 = 0;
        int pr = 0;
        while (p1 < arr1.length || p2 < arr2.length) {
            if (p2 >= arr2.length || p1 < arr1.length && arr1[p1] <= arr2[p2]) {
                resultArr[pr] = arr1[p1];
                p1++;
            } else {
                resultArr[pr] = arr2[p2];
                p2++;
            }
            pr++;
        }
        return resultArr;
    }

    //头尾交换数组元素
    public void convert(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[arr.length - 1 - i] + arr[i];
            arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];
            arr[i] = arr[i] - arr[arr.length - 1 - i];
        }
    }

    @Test
    public void mergeArrTest() {
        int[] arr3 = new B1ArrayOperate().mergeArr(arr1, arr2);
        Tool.printArr(arr3);
    }

    @Test
    public void convertTest() {
        convert(arr1);
        Tool.printArr(arr1);
    }
}
