package string;

import org.junit.jupiter.api.Test;


import java.io.UnsupportedEncodingException;

/**
 * 不可变特性
 */
public class StringTest {
    byte[] bytes = new byte[1024];
    char[] chars = new char[1024];

    //初始化
    String str = "abc";
    String str2 = new String();
    String str3 = new String("abc");

    String str4 = new String(bytes);
    //    String str5 = new String(bytes, "UTF-8");
    String str6 = new String(chars);
    String str7 = new String(chars, 1, 5);


    @Test
    public void commons() throws UnsupportedEncodingException {
        //由于String的不可变特性+=的过程产生一个新的对象，然后str指向新对象
        str += "-lrh";

        //继承自Object类中的方法  重写啦  改变了规则  比较字符串中的字面值
        //==  equals()区别
        System.out.println("1.str与str2是否字符相等：\t" + str.equals(str2));
        //1.忽略大小写比较
        System.out.println("1 str与str2忽略大小写是否字符相等：\t" + str.equalsIgnoreCase(str2));
        //2.继承自Object类中的方法  重写啦  31*h+和
        System.out.println("2.str的hashCode方法重写了：\t" + str.hashCode());
        //实现自Comparable接口  实现方法 结果按照字典排布(unicode编码)顺序
        //按照两个字符串的长度较小的那个(次数)来进行循环
        //若每次的字符不一致 则直接返回code之差
        //若比较之后都一致  则直接返回长度之差
        System.out.println("3.str与str2比较：\t" + str.compareTo(str2));
        //3.忽略大小写比较
        System.out.println("3 str与str2比较：\t" + str.compareToIgnoreCase(str2));

        //4.没有重写过的toString从Object类中继承过来的
        //类名@hashCode(16进制形式)
        //String类重写啦  返回的是String对象的字面值
        System.out.println("4.str的toString方法:\t" + str.toString());

        System.out.println("------------第二梯队-----------------");
        //5.返回给定index位置对应的字符
        System.out.println("5.返回给定index位置对应的字符：\t" + str.charAt(3));
        //返回给定index位置对应字符的code码
        System.out.println("5 返回给定index位置对应字符的code码：\t" + str.codePointAt(3));
        //6.返回字符串的长度   (其实就是底层char[] value属性的长度)
        //注意:区别数组length是属性  String的length()方法  集合size()方法
        System.out.println("6.str的长度：\t" + str.length());

        //7.将给定的str拼接在当前String对象的后面
        //注意:  方法执行完毕需要接受返回值   String的不可变特性
        //concat方法与   +拼接的性能问题
        //开发中若遇到频繁的拼接字符串--->通常使用StringBuilder/StringBuffer
        System.out.println("7.将给定的str拼接在当前String对象的后面:\t" + str.concat(str2));
        //8.判断给定的s是否在字符串中存在
        System.out.println("8.判断给定的s是否在str中存在:\t" + str.contains("a"));
        System.out.println("8.判断给定的abc是否在str中存在:\t" + str.contains("abc"));

        //9.判断此字符串是否以xx开头/结尾
        System.out.println("9.判断此字符串是否以xx开头:" + str.startsWith("abc"));
        System.out.println("9.判断此字符串是否以xx结尾:" + str.endsWith("abc"));


        //10.将当前的字符串转化成数组   "我爱你中国"   char[]  '我' '爱' '你' '中' '国'
        byte[] bytes = str.getBytes();//String转byte数组
        bytes = str.getBytes("UTF-8");//按字符集拆
        //String转字符数组
        char[] chars = str.toCharArray();

        //四个方法重载
        //11.找寻给定的元素在字符串中第一次出现的索引位置   若字符串不存在则返回-1
        int index = str.indexOf(str2);
        index = str.indexOf(str2, 1);
        index = str.indexOf(2);
        //找寻给定的元素在字符串中最后一次出现的索引位置  若不存在则返回-1
        index = str.lastIndexOf(2);

        //12.判断当前字符串是否为空字符串  (length是否为0)
        //注意： 与null之间的区别
        System.out.println("12.str是空吗：\t" + str.isEmpty());

        //13.将给定的字符串替换成另外的字符串
        str.replace("1", "2");
        str.replaceAll("1", "2");
        //换第一次出现的那个字串
        str.replaceFirst("1", "2");

        //14.按照给定的表达式将原来的字符串拆分开的
        String[] strings = str.split("-");
        strings = str.split("-", 1);

        //15.将当前的字符串截取一部分
        //从beginIndex开始至endIndex结束  [beginIndex,endIndex)
        //若endIndex不写 则默认到字符串最后
        System.out.println("15.str从1截取:\t" + str.substring(1));
        System.out.println("15.str从1截取到3:\t" + str.substring(1, 3));

        //16.将全部字符串转换成大写/小写
        System.out.println("16.将全部字符串转换成大写：\t" + str.toUpperCase());
        System.out.println("16.将全部字符串转换成小写：\t" + str.toLowerCase());


        //17.去掉字符串前后多余的空格
        System.out.println("17.去掉字符串前后多余的空格：\t" + str.trim());

        //18.正则表达式,字符串校验
        System.out.println("18.正则表达式,字符串校验：\t" + str.matches("regex"));

    }

    @Test
    public void test() {
        //测试String的值传递
        test(str);
        System.out.println("值传递不会改变原来的str：" + str);
    }

    public void test(String str) {
        str = "111";
    }

    /**
     * 测试正则表达式
     */
    @Test
    public void RegularExpression() {
        String str = "1-2*3#4;";
        String[] strings = str.split("-|\\+|#");
        System.out.println(strings.length);
        for (String val : strings) {
            System.out.println(val);
        }
    }
}
