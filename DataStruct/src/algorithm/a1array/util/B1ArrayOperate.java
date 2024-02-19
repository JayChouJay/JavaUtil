package algorithm.a1array.util;

import algorithm.Tool;
import org.junit.jupiter.api.Test;

public class B1ArrayOperate {
    private int[] arr1 = {1, 3, 5, 9, 13, 14, 19, 25, 31};
    private int[] arr2 = {12, 24, 24, 32, 42, 52, 62, 64};

    //头尾交换数组元素
    public void convert(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[arr.length - 1 - i] + arr[i];
            arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];
            arr[i] = arr[i] - arr[arr.length - 1 - i];
        }
    }

    @Test
    public void convertTest() {
        convert(arr1);
        Tool.printArr(arr1);
    }
}
