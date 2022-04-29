package javasolrdemo;


import java.util.Properties;
 
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class SendEmailTemplate {

	 public static void main(String[] args) {

	        final String username = "er.ravisingh01@gmail.com";   // from email
	        final String password = "*******";                    // Password

	        Properties prop = new Properties();
			prop.put("mail.smtp.host", "smtp.gmail.com");
	        prop.put("mail.smtp.port", "465");
	        prop.put("mail.smtp.auth", "true");
	        prop.put("mail.smtp.socketFactory.port", "465");
	        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	        
	        Session session = Session.getInstance(prop,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(username, password);
	                    }
	                });

	        try {

	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress("er.raviisinghh016@test.com"));  // from email
	            message.setRecipients(
	                    Message.RecipientType.TO,
	                    InternetAddress.parse("ravi@test.com, nik1.raviisinghh@test.com")  // to email , Note: you have to put both email same if you have to send email to one id only. //
	            );
	            message.setSubject("Testing Gmail SSL");
	            message.setText("Dear Send Email Template,"
	                    + "\n\n Please do not spam my email!");

	            Transport.send(message);

	            System.out.println("Email Sent Successfully !!");

	        } catch (MessagingException e) {
	            e.printStackTrace();
	        }
	    }
} 
