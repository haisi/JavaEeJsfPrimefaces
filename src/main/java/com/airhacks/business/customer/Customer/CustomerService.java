package com.airhacks.business.customer.Customer;


import com.airhacks.business.customer.Customer.Customer;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Hasan Kara <hasan.kara@students.fhnw.ch>
 */
@Stateless
public class CustomerService {

    private final List<Customer> customers = new ArrayList<>();

    @PostConstruct
    public void init() {
        customers.add(new Customer("Hans", 10));
        customers.add(new Customer("Franz", 11));
        customers.add(new Customer("Urs", 15));
        customers.add(new Customer("Ruedi", 20));
    }

    public String getCustomerName() {
        return "Thomas";
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
