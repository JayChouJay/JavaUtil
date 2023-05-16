package collections.array;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 二分查找
 */
public class ArraysT {
    private String[] userArray = {"周杰伦", "邓紫棋", "张国荣", "老番茄", "成龙", "BB"};

    @Test
    public void asList() {
        System.out.println("-----------数组转List----------");
        List list = Arrays.asList(userArray);
        //遍历验证
        for (Object val : list) {
            System.out.println(val);
        }
    }

    /**
     * 动态参数
     */
    @Test
    public void asList2() {
        System.out.println("-----------数组转List----------");
        List list = Arrays.asList("周杰伦","邓紫棋");
        //遍历验证
        for (Object val : list) {
            System.out.println(val);
        }
    }

    @Test
    public void sort1() {
        int[] nums = {2, 5, 0, 4, 6, -10};
        System.out.println("-----------int数组排序----------");
        Arrays.sort(nums);
        for (int i : nums)
            System.out.print(i + " ");
    }

    @Test
    //不常用方法
    public void sort2() {
        int[] nums = {2, 5, 0, 4, 6, -10};
        System.out.println("-----------int数组指定位置排序排序----------");
        Arrays.sort(nums, 1, 4);
        for (int i : nums)
            System.out.print(i + " ");
    }

    @Test
    //可以为数组元素填充相同的值
    public void fill() {
        int[] nums = {2, 5, 0, 4, 1, -10};
        Arrays.fill(nums, 1);
        for (int i : nums)
            System.out.print(i + " ");
        /* 之前:2 5 0 4 1 -10
         * 结果:1 1 1 1 1 1
         */
    }

    @Test
    //可以为数组元素填充相同的值
    public void fill2() {
        int[] nums = {2, 5, 0, 4, 1, -10};
        //对数组元素下标2到4的元素赋值为3
        Arrays.fill(nums, 2, 5, 3);
        for (int i : nums)
            System.out.print(i + " ");
        /* 之前:2 5 0 4 1 -10
         * 结果:2 5 3 3 3 -10
         */
    }

    @Test
    //返回数组的字符串形式(打印数组)
    public void toStringT() {
        int[] nums = {2, 5, 0, 4, 1, -10};
        System.out.println(Arrays.toString(nums));
        /*
         * 结果:[2, 5, 0, 4, 1, -10]
         */
    }

    @Test
    //返回多维数组的字符串形式
    public void deepToString() {
        int[][] nums = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(nums));
        /*
         * 结果:[[1, 2], [3, 4]]
         */
    }

    @Test
    public void binarySearch() {
        int[] arr = {};
        Arrays.binarySearch(arr, 1);
    }
}
