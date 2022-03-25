package com.bob.sales;

public class SalesTester {
    public static void main(String[] args) {
        Customer first=new Customer("0001",1200);
        first.print();
        Customer second=new Customer("0002",800);
        second.print();
        SliverCustomer third=new SliverCustomer("0003",2000);
        third.print();
        GoldenCustomer fourth=new GoldenCustomer("0004",2000);
        fourth.print();

    }


}
