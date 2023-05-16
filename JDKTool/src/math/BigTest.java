package math;

import org.junit.jupiter.api.Test;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class BigTest {
    /**
     * BigInteger
     * 应用：阶乘
     */
    @Test
    public void bigInteger() {
        //初始化
        //通过带String参数的构造方法创建对象
        BigInteger val1 = new BigInteger("123");
        BigInteger val2 = new BigInteger("123");

        System.out.println("加法：\t" + val1.add(val2));
        System.out.println("减法：\t" + val1.subtract(val2));
        System.out.println("乘法：\t" + val1.multiply(val2));
        System.out.println("除法：\t" + val1.divide(val2));
        System.out.println("加减不会影响val1的值：\t" + val1);

    }
    /**
     * BigDecimal
     *介绍：格式化只能处理小数点之后的，处理方式多
     */
    @Test
    public void bigDecimal() {
        //初始化
        //通过带String参数的构造方法创建对象
        BigDecimal dec1 = new BigDecimal("123.22");
        BigDecimal dec2 = new BigDecimal("123.22");

        System.out.println("加法：\t" + dec1.add(dec2));
        System.out.println("减法：\t" + dec1.subtract(dec2));
        System.out.println("乘法：\t" + dec1.multiply(dec2));
        System.out.println("除法：\t" + dec1.divide(dec2));
        System.out.println("加减不会影响dec2的值：\t" + dec2);
        //格式化小数点：默认四舍五入
        // ROUND_DOWN--删除小数位
        // ROUND_UP--进位处理
        // ROUND_HALF_UP--四舍五入
        // ROUND_HALF_DOWN--四舍五入
        System.out.println("保留n位小数，"+dec1.setScale(1, BigDecimal.ROUND_UP));
    }

    /**
     * DecimalFormat
     * 所属包：java.text（格式化包）
     *
     */
    //数字格式化成String
    @Test
    public void decimalFormat() {
        //初始化：
        //通过带String参数的构造方法创建对象   String-->一种格式
        //0代表必须有，#代表可以没有
        DecimalFormat df = new DecimalFormat("###.000");

        //给定的数字格式化成上述的效果
        String val = df.format(123.45);
        System.out.println(val);
    }
}
