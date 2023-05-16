package algorithm.a1array;

public class CSparseArray {
    //把普通数组 转化为 稀疏数组
    public static int[][] toSparse(int[][] arr) {
        //(n+1)*3列的数组 初始化
        //需要先求 非零元素的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0) {
                    count++;
                }
            }
        }
        int[][] result = new int[count + 1][3];
        result[0][0] = arr.length;
        result[0][1] = arr[0].length;
        result[0][2] = count;
        //遍历数组 找到所有非零元素 存储到结果中
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0) {
                    index++;
                    result[index][0] = i;
                    result[index][1] = j;
                    result[index][2] = arr[i][j];
                }

            }
        }
        return result;
    }

}
