package algorithm.a0simple;

/**
 * 时间复杂度练习
 */
public class SpaceTest {
    /**
     * 空间复杂度：O(1)
     * <p>
     * 时间复杂度：O(1)
     */
    public void constant() {
        int i = 1;
        int j = 2;
    }

    /**
     * 空间复杂度：O(n)
     * <p>
     * 时间复杂度：O(n)
     */
    public void foreach() {
        int n = 100;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            //TODO
        }
    }
}
