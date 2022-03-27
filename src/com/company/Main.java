package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Lebedeva", "Inna", "Ivanovna", "Warsaw", 56, 34);
        Customer customer2 = new Customer(2, "Istomina", "Kristina", "Kirillovna", "Moscow", 82, 57);
        Customer customer3 = new Customer(3, "Koval", "Dmitriy", "Sergeevich", "Moscow", 12, 32);
        Customer customer4 = new Customer(4, "Remberg", "Xenia", "Yuriovna", "Minsk", 29, 86);
        Customer customer5 = new Customer(5, "Khomich", "Fedor", "Andreevich", "Vilnius", 94, 61);
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        Result result = new Result(customers);
        result.printBankAccount(50, 100);
    }
}
