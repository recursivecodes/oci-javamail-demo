package codes.recursive;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.time.LocalDateTime;
import java.util.Properties;

public class EmailSender {

    public void send() {
        final String fromEmail = System.getProperty("SMTP_USER");
        final String password = System.getProperty("SMTP_PASSWORD");
        final String toEmail = System.getProperty("EMAIL_TO");

        System.out.println("TLSEmail Start");
        Properties props = new Properties();
        props.put("mail.smtp.host", System.getProperty("SMTP_HOST"));
        props.put("mail.smtp.port", System.getProperty("SMTP_PORT"));
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        //create Authenticator object to pass in Session.getInstance argument
        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        Session session = Session.getInstance(props, auth);
        session.setDebug(true);
        EmailUtil.sendEmail(session, toEmail,"TLSEmail Testing Subject at " + LocalDateTime.now(), "TLSEmail Testing Body");

    }
}
