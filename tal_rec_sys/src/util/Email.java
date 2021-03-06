package util;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class Email {

    //发件人地址
    private static String senderAddress;
    //收件人地址
    private static String recipientAddress;
    //发件人账户名
    private static String senderAccount;
    //发件人账户授权码
    private static String senderPassword;
    //邮件标题
    private static String subject;
    //邮件内容
    private static String content;

    Email(String senderAddress1,String recipientAddress1,String senderAccount1,String senderPassword1) throws Exception {
        //设置发件与收件信息
        senderAddress = senderAddress1;
        recipientAddress = recipientAddress1;
        senderAccount = senderAccount1;
        senderPassword = senderPassword1;

    }

    public void SendEmail() throws Exception{
        //1、连接邮件服务器的参数配置
        Properties props = new Properties();

        //设置用户的认证方式
        props.setProperty("mail.smtp.auth", "true");

        //设置传输协议
        props.setProperty("mail.transport.protocol", "smtp");

        //设置发件人的SMTP服务器地址
        props.setProperty("mail.smtp.host", "smtp.163.com");

        //2、创建定义整个应用程序所需的环境信息的 Session 对象
        Session session = Session.getInstance(props);

        //设置调试信息在控制台打印出来
        session.setDebug(true);

        //3、创建邮件的实例对象
        Message msg = getMimeMessage(session);

        //4、根据session对象获取邮件传输对象Transport
        Transport transport = session.getTransport();

        //设置发件人的账户名和密码
        transport.connect(senderAccount, senderPassword);

        //发送邮件，并发送到所有收件人地址，message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(msg,msg.getAllRecipients());

        //5、关闭邮件连接
        transport.close();
    }
    /**
     * 获得创建一封邮件的实例对象
     * @param session
     * @return
     * @throws MessagingException
     * @throws AddressException
     */

    private static MimeMessage getMimeMessage(Session session) throws Exception{

        //创建一封邮件的实例对象
        MimeMessage msg = new MimeMessage(session);

        //设置发件人地址
        msg.setFrom(new InternetAddress(senderAddress));

        /**
         * 设置收件人地址（可以增加多个收件人、抄送、密送），即下面这一行代码书写多行
         * MimeMessage.RecipientType.TO:发送
         * MimeMessage.RecipientType.CC：抄送
         * MimeMessage.RecipientType.BCC：密送
         */

        msg.setRecipient(MimeMessage.RecipientType.TO,new InternetAddress(recipientAddress));
        //设置邮件主题

        msg.setSubject(subject,"UTF-8");
        //设置邮件正文

        msg.setContent(content, "text/html;charset=UTF-8");
        //设置邮件的发送时间,默认立即发送
        msg.setSentDate(new Date());

        return msg;
    }

    private void changeRecipientAddress(String NewAddress){
        recipientAddress = NewAddress;
    }

    private void changeSubject(String NewSubject){
        subject = NewSubject;
    }

    private void changeContent(String NewContent){
        content = NewContent;
    }
}
