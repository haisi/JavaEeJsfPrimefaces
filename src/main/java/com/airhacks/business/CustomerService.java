package com.airhacks.business;


import javax.ejb.Stateless;

/**
 * @author Hasan Kara <hasan.kara@students.fhnw.ch>
 */
@Stateless
public class CustomerService {

    public String getCustomerName() {
        return "Thomas";
    }

}
