package algorithm.a1array.sort;

import java.lang.reflect.Array;
import java.util.ArrayList;

//快速排序
public class QuickSort {
    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {
        if (arr == null || arr.size() <= 1) return arr;
        //选组长
        int leader = arr.get(0);
        //小的放左边，大的放右边
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) <= leader) left.add(arr.get(i));
            else right.add(arr.get(i));
        }
        //递归
        ArrayList<Integer> leftResult = quickSort(left);
        ArrayList<Integer> rightResult = quickSort(right);
        //拼接
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(leftResult);
        result.add(leader);
        result.addAll(rightResult);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(8);
        list.add(5);
        System.out.println(quickSort(list));
    }
}
