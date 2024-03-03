package iegcode.SpringFramework.listener;

import iegcode.SpringFramework.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserListener {

    @EventListener(classes = LoginSuccessListener.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event){
        log.info("Success login again for user {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessListener.class)
    public void onLoginSuccessEvent2(LoginSuccessEvent event){
        log.info("Success login again for user {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessListener.class)
    public void onLoginSuccessEvent3(LoginSuccessEvent event){
        log.info("Success login again for user {}", event.getUser());
    }
}
