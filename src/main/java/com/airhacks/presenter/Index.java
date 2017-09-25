package com.airhacks.presenter;

import com.airhacks.business.customer.Customer.CustomerService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Hasan Kara <hasan.kara@students.fhnw.ch>
 */
@RequestScoped
@Named
public class Index {

    private final CustomerService customerService;

    @Inject
    public Index(CustomerService customerService) {
        this.customerService = customerService;
    }

    public String getCustomerName() {
        return customerService.getCustomerName();
    }
}
