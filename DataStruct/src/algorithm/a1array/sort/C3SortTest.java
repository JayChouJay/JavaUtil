package algorithm.a1array.sort;

import algorithm.Tool;
import org.junit.jupiter.api.Test;

public class C3SortTest {
    int arr[] = {1, 2, 3, 3, 3, 5, 2};

    @Test
    //冒泡排序
    public void bobble() {
        C1Sort.bubble(arr);
        Tool.printArr(arr);
    }

    @Test
    //冒泡排序重载-能指定顺序的
    public void bobbleFlag() {
        C1Sort.bubble(arr, true);
        Tool.printArr(arr);
    }

    @Test
    //选择排序
    public void selectSort(){
        C1Sort.selectSort(arr);
        Tool.printArr(arr);
    }
    @Test
    //低级选择排序
    public void selectSort2(){
        C1Sort.selectSort2(arr);
        Tool.printArr(arr);
    }
}
