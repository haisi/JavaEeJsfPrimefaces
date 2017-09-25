package com.airhacks.presenter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Hasan Kara <hasan.kara@students.fhnw.ch>
 */
@RequestScoped
@Named
public class Customers {

    public String getGreeting() {
        return "Greeting my friend";
    }

}
