import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Junit不支持多线程，主线程结束子线程跟着结束
 */
public class JavaTimer {
    Logger logger = LoggerFactory.getLogger(EmailTest.class);

    @Test
    public void timerTest() throws ParseException {
        logger.debug("开始定时发送邮件");
        String[] userArray = {"周杰伦", "邓紫棋", "张国荣", "老番茄", "成龙", "BB"};
        ArrayList<String> userList = new ArrayList<>(Arrays.asList(userArray));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
        Date firstTime = sdf.parse("2023-04-08 00:32:40");
        //找一个计时器对象帮我们倒计时时间，时间到了就做事
        Timer timer = new Timer();
        //每隔一段时间做事儿
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
