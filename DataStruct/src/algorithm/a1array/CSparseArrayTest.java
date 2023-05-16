package algorithm.a1array;

import org.junit.jupiter.api.Test;

public class CSparseArrayTest {
    @Test
    public void sparseArray() {
        int[][] arr = new int[10][10];
        arr[1][2] = 1;
        arr[3][1] = 2;
        arr[2][2] = 2;

        System.out.println("输出原始数组：");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        int[][] result = CSparseArray.toSparse(arr);
        System.out.println("输出稀疏数组：");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1] + "\t" + result[i][2]);
        }
    }
}
