package iegcode.SpringFramework.service;

import iegcode.SpringFramework.data.User;
import iegcode.SpringFramework.event.LoginSuccessEvent;
import iegcode.SpringFramework.prosessor.PrefixIdGeneratorBeanProcessor;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password){
        if(isLoginSuccess(username, password)){
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        }else{
            return false;
        }
    }

    private boolean isLoginSuccess(String username, String password) {
        return "ieg".equals(username) && "ieg".equals(password);
    }
}
