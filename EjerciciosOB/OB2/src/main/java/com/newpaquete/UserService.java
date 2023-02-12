package com.newpaquete;

import com.newpaquete.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notificationService){
        System.out.println("estamos en el constructor de notification service");
        this.notificationService = notificationService;
    }
}

