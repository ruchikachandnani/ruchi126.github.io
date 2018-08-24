/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
import javax.mail.internet.MimeMessage;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.swing.JOptionPane;
public class Mail {
   static String Mail=null;
    static String Sub=null;
    static String Msg=null;
    public static void MailConnection(String mail,String sub,String msg){
        Mail=mail;
        Sub=sub;
        Msg=msg;
        
         Properties props=new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        Session session=Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication(){
                        return new PasswordAuthentication("sangitahem10@gmail.com", "Priti@488");
                    }
                   }
                
                );
        try{
            
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress("sangitahem10@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Mail));
            message.setSubject(Sub);
            message.setText(Msg);
            Transport.send(message);
            //JOptionPane.showMessageDialog(null,"sent msg");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
       
    }
    
}
