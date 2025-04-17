package com.kaushik.test.respository;

import java.util.ArrayList;

import com.kaushik.test.models.Customer;

public class CustomerRepository {
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addMockCustomers(int count) {
        for (int i = 0; i < count; i++) {
            Customer customer = new Customer();
            customer.name = "Customer" + i;
            customer.age = 20 + (int) Math.ceil(Math.random() * 10);
            customers.add(customer);
        }
    }

    public ArrayList<Customer> getCustomersByAge(int age) {
        ArrayList<Customer> result = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.age == age) {
                result.add(customer);
            }
        }
        return result;
    }
}
