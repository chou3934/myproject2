package com.bob.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    public static void main(String[] args) {
        List<Customer> customers=new ArrayList<>();
        customers.add(new Customer("0001",1200));
        customers.add(new Customer("0002",800));
        customers.add(new SliverCustomer("0003",2500));
        customers.add(new GoldenCustomer("0004",2500));
        customers.add(new PlatinumCustomer("0005",2500));

        //for (int i = 0; i < 5; i++) {
        //    customers.get(i).print();
        //}
        for(Customer c:customers){
            c.print();
        }

    }


}
