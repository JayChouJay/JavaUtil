package date;

import org.junit.jupiter.api.Test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {
    /**
     * System的时间方法
     */
    @Test
    public void systemTest() {
        //获取当前系统时间--->1970-1-1 00:80:00  毫秒形式
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    /**
     * util.Date
     */
    @Test
    public void dateTest() {
        //初始化
        //无参数构造方法--当前时间
        Date date = new Date();
        //有参构造方法--指定时间
        Date date2 = new Date(1);
        //大true，其他false
        System.out.println("date在date2之后吗：\t" + date.after(date2));
        //小true，其他false
        System.out.println("date在date2之前吗：\t" + date.before(date2));
        //1大，0等，-1小
        System.out.println("date在date2之后吗：\t" + date.compareTo(date2));
        //设置毫秒值
        date.setTime(2);
        System.out.println("date的long毫秒值：\t" + date.getTime());
    }

    /**
     * sql.Date
     * 重写了toString方法
     */
    @Test
    public void sqlDateTest() {
        //初始化
        //需要long类型的毫秒值
        java.sql.Date date = new java.sql.Date(new Date().getTime());
        //不建议使用
        java.sql.Date date2 = new java.sql.Date(13, 22, 3);

        System.out.println("sql.Date重写了toString方法：\t" + date);
        System.out.println(date2);
    }

    /**
     * SimpleDateFormat
     * 字符串与Date相互转换
     */
    @Test
    public void sdfTest() throws ParseException {
        Date date = new Date();
        //初始化
        //带String参数的构造方法
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd KK:mm:ss");

        //日期转字符+字符转日期
        String value = sdf.format(date);
        Date date1 = sdf.parse("2019-01-31 11:50:00");

        //打印测试
        System.out.println(value + "\t" + date1);
    }

    /**
     * Calender
     * 作用：我现在也想知道
     */
    @Test
    public void calenderT() {
        //初始化：
        //需要通过类中的一个方法创建对象
        //默认当前系统时间的一个对象
        Calendar c = Calendar.getInstance();

        c.after(1);
        c.before(2);
        c.setTime(new Date());
        c.getTime();
        c.set(Calendar.YEAR, 1);
        c.get(Calendar.YEAR);
        c.getTimeInMillis();
        //获取对应的时区
        c.getTimeZone();
        System.out.println(c);
    }

    /**
     * TimeZone
     * 作用：我也不知道啊
     */
    @Test
    public void timeZone() {
        //需要通过类中的一个方法创建对象
        TimeZone tz = TimeZone.getDefault();
        tz.getID();
        tz.getDisplayName();

        System.out.println(tz);
    }
}
