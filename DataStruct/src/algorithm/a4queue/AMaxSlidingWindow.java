package algorithm.a4queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 滑动窗口的最大值
 * <p>
 * 来源：leetCode-剑指offer59
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 * <p>
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 */
public class AMaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        //记录每个窗口的最大值
        int[] result = new int[nums.length - k + 1];
        //使用队列记录最大值候选值
        Deque<Integer> deque = new ArrayDeque<>();

        //窗口未形成阶段
        for (int i = 0; i < k; i++) {
            print(deque);
            //每次都取 队尾元素和新元素比较
            while (!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.pollLast();
            deque.offer(nums[i]);
        }
        //此时第一个窗口形成 deque的对头元素就是第一个最大值
        result[0] = deque.peekFirst();
        print(deque);

        //窗口已形成的阶段
        for (int i = k; i < nums.length; i++) {
            System.out.println("----第-" + (i - k + 1) + "-次滑动");
            //删了元素 nums[i-k] 添加了元素 nums[i]
            if (nums[i - k] == deque.peekFirst()) {
                //如果删的是最大值，同时从deque中移除
                deque.pollFirst();
            }

            //新增
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(nums[i]);
            result[i - k + 1] = deque.peekFirst();
            print(deque);
        }
        return result;

    }

    public static void print(Deque deque) {
        for (Object o : deque) {
            System.out.print(o + "\t");
        }
        System.out.println();
    }
}
