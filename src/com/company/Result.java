package com.company;

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
            if (customers.get(i).getBankAccount() > min && customers.get(i).getBankAccount() < max) {
                System.out.println(customers.get(i));
            }
        }
    }

    public static void main(String[] args) {
    }

    public Result(List<Customer> customers) {
        this.customers = customers;
    }
}