package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Result {
    private List<Customer> customers;


    public List<Customer> getCustomer() {
        return customers;
    }

    public void setCustomer(List<Customer> customer) {
        this.customers = customer;
    }

    public void printBankAccount(int min, int max) {
        for (int i = 0; i < customers.size(); i++) {
            if (bankAccount > min && bankAccount < max) {
                System.out.println(customers);
            }
        }
    }

    public void printSurname() {
        for (int i = 0; i < customers.size(); i++) {
            Collections.sort(customers, new Comparator<Customer>() {

                @Override
                public int compare(Customer o1, Customer o2) {
                    return 0;
                }

                @Override
                public int compareTo(Customer o) {
                    return this.surname.compareTo(o.getSurname());
                }
                }
            });
                System.out.println(surname);
            }
        }

    public static void main(String[] args) {
    }

    public Result(List<Customer> customers) {
        this.customers = customers;
    }
}