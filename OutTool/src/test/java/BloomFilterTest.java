import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.junit.jupiter.api.Test;

public class BloomFilterTest {
    /**
     * 预计要插入多少数据
     */
    private int size = 1000000;
    /**
     * 期望的误判率
     * 误判率越低，hash算法数量越多，numBits长度越长
     */
    private double fpp = 0.00000000000000000000000003;
    /**
     * 布隆过滤器
     */
    private BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), size, fpp);

    private int total = 1000000;

    @Test
    void bloomFilter() throws InterruptedException {
        //插入10万样本数据
        for (int i = 0; i < total; i++) {
            bloomFilter.put(i);
        }

        //用另外十万测试数据，测试误判率
        long startTime = System.currentTimeMillis();

        int count = 0;
        for (int i = total; i < total + 100000; i++) {
            if (bloomFilter.mightContain(i)) {
                count++;
                System.out.println(i + "找到了");
            }
        }

        System.out.println("总共的误判数" + count);
        long endTime = System.currentTimeMillis();
        System.out.println("消耗时间"+(endTime-startTime));

    }

}
