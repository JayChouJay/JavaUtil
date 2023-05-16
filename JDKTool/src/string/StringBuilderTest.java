package string;

import org.junit.jupiter.api.Test;


public class StringBuilderTest {
    //初始化
    //无参初始化
    private StringBuilder buffer = new StringBuilder();

    @Test
    public void commons() {
        //带参初始化
        buffer = new StringBuilder("abc");

        //常用方法
        System.out.println("--------------与String类不同的独有方法----------");
        //1.拼接
        buffer.append("a");
        //插入
        buffer.insert(1, "abc");
        //删除
        buffer.delete(1, 2);
        //删除指定位置字符
        buffer.deleteCharAt(2);
        //自身反转
        buffer.reverse();
        System.out.println(buffer);

        System.out.println("--------------与String相同的方法----------");
        //字符串长度
        buffer.length();
        //字符位置
        buffer.charAt(1);
        //字符位置
        buffer.codePointAt(1);
        //位置
        buffer.indexOf("1");
        //
        buffer.lastIndexOf("1");
        //替换
        buffer.replace(1, 2, "abc");
        //截取
        buffer.substring(2, 5);

    }
}
