package math;

import org.junit.jupiter.api.Test;


import java.util.Random;
import java.util.UUID;

public class MathTest {
    /**
     * Math
     * 介绍：所有的属性和方法都是静态的  不需要创建对象
     */
    @Test
    public void mathTest() {

        System.out.println("Math.PI:\t" + Math.PI);
        System.out.println("-1的绝对值：\t" + Math.abs(-1));
        System.out.println("2,3最大的是：\t" + Math.max(2, 3));
        System.out.println("2,3最小的是:\t" + Math.min(2, 3));
        System.out.println("2.2的向上取整\t：" + Math.ceil(2.2));
        System.out.println("2.2的向下取整\t：" + Math.floor(2.2));
        System.out.println("2.2的四舍五入\t：" + Math.round(2.2));
        System.out.println("2.6的四舍五入\t：" + Math.round(2.6));
        System.out.println("2的平方根是：\t" + Math.sqrt(2));
        System.out.println("2的平方是：\t" + Math.pow(2.1, 2));
        System.out.println("随机产生：0-1小数\t" + Math.random());
    }

    /**
     * Random
     */
    @Test
    public void RandomTest() {
        //初始化
        Random random = new Random();
        System.out.println("生成小于Long的随机整数:\t" + random.nextInt());
        System.out.println("输出小于5的随机整数:\t" + random.nextInt(5));
        System.out.println("输出小于1的随机小数:\t" + random.nextFloat());
        System.out.println("输出小于1的随机小数:\t" + random.nextDouble());
        System.out.println("输出true或false:\t" + random.nextBoolean());

    }

    /**
     * UUID
     * 名字：Universally Unique Identifier（通用唯一识别码）
     */
    @Test
    public void UUIDTest() {
        //随机生成一个32位16进制的UUID
        UUID uuid = UUID.randomUUID();
        //输出32位的16进制的元素
        System.out.println(uuid);
    }
}
