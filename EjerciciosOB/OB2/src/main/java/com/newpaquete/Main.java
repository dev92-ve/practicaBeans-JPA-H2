package com.newpaquete;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        NotificationService notificationService = (NotificationService) context.getBean("notificationService");
            String notificando = notificationService.notificandoSaludo();
        System.out.println(notificando);

    }
}
