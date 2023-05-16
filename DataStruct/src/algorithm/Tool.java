package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Tool {
    /**
     * 接收输入的int整数
     * 转化成int数组并返回
     * Junit不支持Scanner
     *
     * @return
     */
    public static int[] inputIntArr() {
        //初始化打印器
        Scanner input = new Scanner(System.in);
        //接收数组：1 2 3 4
        String str = input.nextLine();
        //按照空格拆分
        String[] strs = str.split(" ");
        //创建接收数组
        int[] arr = new int[strs.length];
        //遍历，将string数组转化为int数组
        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        //打印数组的长度
        System.out.println("原始arr：" + arr.length);
        //返回输入的数组
        return arr;
    }

    /**
     * 遍历 打印 int数组
     */
    public static void printArr(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    //int批量初始化:1到n
    public static void intBatch(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }
    //int批量初始化:1到n
    public static void intBatch(int[] arr,int begin) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+begin;
        }
    }
}
