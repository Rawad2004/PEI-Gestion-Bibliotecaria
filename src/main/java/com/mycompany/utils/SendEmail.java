package com.mycompany.utils;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {
    
    private final String emailFrom = "noreplybookly01@gmail.com";
    private final String password = "zobu ptgp hqzr dsyk";
    private Properties properties;
    private Authenticator auth;

    public SendEmail() {
        configurarPropiedades();
    }

    private void configurarPropiedades() {
        properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailFrom, password);
            }
        };
    }

    public void enviarCorreo(String mailTo, String subject, String content) {
        try {
            Session session = Session.getInstance(properties, auth);
            MimeMessage message = new MimeMessage(session);
            
            // Configurar remitente y destinatario
            message.setFrom(new InternetAddress(emailFrom));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailTo));
            
            // Configurar asunto y contenido
            message.setSubject(subject);
            message.setContent(content, "text/html; charset=utf-8");
            
            // Enviar el correo
            Transport.send(message);
            System.out.println("Correo enviado exitosamente a: " + mailTo);
            
        } catch (MessagingException e) {
            System.err.println("Error al enviar correo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}