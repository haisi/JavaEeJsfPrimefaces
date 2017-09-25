package com.airhacks.presenter;

import com.airhacks.business.customer.Customer.CustomerService;
import com.airhacks.business.customer.Customer.Customer;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * @author Hasan Kara <hasan.kara@students.fhnw.ch>
 */
@RequestScoped
@Named
public class Customers {

    private final CustomerService customerService;

    @Inject
    public Customers(CustomerService customerService) {
        this.customerService = customerService;
    }

    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

}
