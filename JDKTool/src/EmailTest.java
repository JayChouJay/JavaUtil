import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * 使用mail包发送邮件
 */
public class EmailTest {
    Logger logger= LoggerFactory.getLogger(EmailTest.class);


    //设计一个方法，创建一个邮件对象
    //参数？一个session
    //返回值？一个邮件对象（映射）MimeMessage
    private MimeMessage createMessage(Session session) throws MessagingException {
        //自己创建一个邮件对象
        MimeMessage message = new MimeMessage(session);
        //设置邮件的基本信息
        //设置发送人和接收人
        message.setFrom(new InternetAddress("1020968571@qq.com"));
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress("553278752@qq.com"));
        //message.setSentDate(new Date());
        message.setSubject("这是邮件的主题");
        //设置发送邮件正文
        message.setText("这是邮件的正文");
        //以上所有设置需要保存才能生效
        message.saveChanges();
        return message;
    }

    @Test
    public void testSendEmail() throws MessagingException {
        logger.debug("开始发送邮件");
        //创建一个用于存放配置文件的对象，Properties类型
        Properties prop = new Properties();
        //设置发送邮件的协议smtp
        prop.put("mail.transport.protocol", "smtp");
        //设置发送邮件的主机名
        prop.put("mail.smtp.host", "smtp.qq.com");
        //色红孩子发送邮件时 是否需要进行身份验证
        prop.put("mail.smtp.auth", "true");
        //设置是否使用ssl安全连接 默认使用
        prop.put("mail.smtp.ssl.enable", "true");
        //创建一个session对象（可以理解为是一个Socket，Java和邮箱之间建立一个连接)
        Session session = Session.getDefaultInstance(prop);
        //通过session对象获取一个Transport对象（可以理解为是一个输出流）
        Transport ts = session.getTransport();
        //想要通过邮箱发送邮件，必须得到邮件服务器的认证
        ts.connect("1020968571@qq.com", "jrwskdtolderbdii");
        Message message = createMessage(session);
        ts.sendMessage(message, message.getAllRecipients());
        ts.close();
        logger.debug("发送成功");
    }
}
