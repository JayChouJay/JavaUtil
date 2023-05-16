package algorithm.a1array;

public class ATwoSum {
    /**
     * 1.判断数组中两数是否能组成目标值
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
        }
        System.out.println(result[0] + "--" + result[1]);
        return result;
    }
}
