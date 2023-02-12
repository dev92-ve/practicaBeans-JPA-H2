package com.newpaquete;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public String notificandoSaludo(){
        return "Notificacion: te estamos saludando";
    }


}
