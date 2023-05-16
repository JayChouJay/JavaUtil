package util;

import java.util.Scanner;

public class Utils {
    //接收输入的int整数
    //转化成int数组并返回
    //Junit不支持Scanner
    public static int[] inputIntArr() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] strs = str.split(" ");
        int[] arr = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        System.out.println("原始arr：" + arr.length);
        return arr;
    }

    //打印整数数组
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
}
