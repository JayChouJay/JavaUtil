package thread.threadtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Timer
 * 工具：计时器 / 定时器
 */
public class TimerTest {
    public static void main(String[] args) throws ParseException {
        Logger logger = LoggerFactory.getLogger(TimerTest.class);
        logger.debug("开始定时发送邮件");
        String[] userArray = {"周杰伦", "邓紫棋", "张国荣", "老番茄", "成龙", "BB"};
        ArrayList<String> userList = new ArrayList<>(Arrays.asList(userArray));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
        Date firstTime = sdf.parse("2023-04-08 00:32:40");

        //构造：无参构造方法
        //找一个计时器对象帮我们倒计时时间，时间到了就做事
        Timer timer = new Timer();
        //每隔一段时间做事儿
        //执行任务，每隔1000ms做一次
        //抛出异常:ParseException
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (String user : userList)
                    logger.debug("给-" + user + "-发消息");
            }
        }, firstTime, 3000);

        logger.debug("我是最后执行");
    }
}
