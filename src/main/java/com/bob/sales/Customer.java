package com.bob.sales;

import java.util.SplittableRandom;

public class Customer {
    String number;
    int price;

    public Customer(String number,int price){
        this.number=number;
        this.price=price;

    }
    public void print(){
        if(price>1000){
            int money=(price/1000)*100;
            System.out.print(number+"\t"+price+"\t"+(price-money));
        }
        else{
            System.out.print(number+"\t"+price+"\t"+price);
        }

        System.out.println();

    }

}
