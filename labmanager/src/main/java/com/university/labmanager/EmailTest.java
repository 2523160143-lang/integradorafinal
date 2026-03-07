package com.university.labmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class EmailTest implements CommandLineRunner {

    @Autowired
    private JavaMailSender emailSender;

    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(EmailTest.class, args)));
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting Email Test...");
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("ortizlopezf59@gmail.com");
            message.setTo("ortizlopezf59@gmail.com");
            message.setSubject("Test Email from LabManager");
            message.setText("If you see this, the SMTP configuration is working perfectly.");

            emailSender.send(message);
            System.out.println("✅ EMAIL SENT SUCCESSFULLY!");
        } catch (Exception e) {
            System.out.println("❌ FAILED TO SEND EMAIL:");
            e.printStackTrace();
        }
        System.out.println("Email Test Finished.");
    }
}
