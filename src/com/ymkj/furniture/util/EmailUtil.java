package com.ymkj.furniture.util;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class EmailUtil {
	
	public static void main(String[] args) {
		new EmailUtil().sendEmail("标题", "内容", "13538487031@163.com");
	}
	
	public String sendEmail(String title,String context,String recEmail){
		try {
			Properties props = new Properties();
	 		 
		    // 开启debug调试
		    props.setProperty("mail.debug", "true");
		    // 发送服务器需要身份验证
		    props.setProperty("mail.smtp.auth", "true");
		    // 设置邮件服务器主机名
		    props.setProperty("mail.host", "smtp.qq.com");
		    // 发送邮件协议名称
		    props.setProperty("mail.transport.protocol", "smtp");
		 
		    MailSSLSocketFactory sf = new MailSSLSocketFactory();
		    sf.setTrustAllHosts(true);
		    props.put("mail.smtp.ssl.enable", "true");
		    props.put("mail.smtp.ssl.socketFactory", sf);
		 
		    Session session = Session.getInstance(props);
		 
		    MimeMessage msg = new MimeMessage(session);
		    msg.setSubject(title);
		    StringBuilder builder = new StringBuilder();
		    builder.append(context);
		    msg.setContent(builder.toString(),"text/html;charset=UTF-8");
		    msg.setFrom(new InternetAddress("578581198@qq.com"));//"发送者邮箱"
		 
		    Transport transport = session.getTransport();
		    transport.connect("smtp.qq.com", "578581198@qq.com", "xafnbegojaxwbeaj");//发送者邮箱授权码
		    
		    transport.sendMessage(msg, new Address[] { new InternetAddress(recEmail) });//"接收者邮箱"
		    transport.close();
		    return "SUCCESS";
		} catch (Exception e) {
			return "FAIL";
		}
	}
}
