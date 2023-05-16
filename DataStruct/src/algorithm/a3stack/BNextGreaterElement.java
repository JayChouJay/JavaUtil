package algorithm.a3stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 下一个更大元素
 * <p>
 * 来源：leetcode-496
 * nums1 中数字 x 的 下一个更大元素 是指 x 在 nums2 中对应位置 右侧 的 第一个 比 x 大的元素。
 * <p>
 * 给你两个 没有重复元素 的数组 nums1 和 nums2 ，下标从 0 开始计数，其中nums1 是 nums2 的子集。
 * <p>
 * 对于每个 0 <= i < nums1.length ，找出满足 nums1[i] == nums2[j] 的下标 j ，并且在 nums2 确定 nums2[j] 的 下一个更大元素 。如果不存在下一个更大元素，那么本次查询的答案是 -1 。
 * <p>
 * 返回一个长度为 nums1.length 的数组 ans 作为答案，满足 ans[i] 是如上所述的 下一个更大元素 。
 * 输入：nums1 = [4,1,2], nums2 = [1,3,4,2].
 * 输出：[-1,3,-1]
 */
public class BNextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        //暂时忽略num1 直接求取nums2中 每个元素的下一个最大值
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++) {
            //比较 栈顶元素和新元素
            while (!stack.empty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            //如果新元素更小 直接入栈 等待后面出现的更大元素
            //如果找到更大元素 存入map后 新元素仍要出栈
            stack.push(nums2[i]);
        }

        //如果栈中还有元素 代表没有出现过更大元素
        while (!stack.empty()) {
            map.put(stack.pop(), -1);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}
