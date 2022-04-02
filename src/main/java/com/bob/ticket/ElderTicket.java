package com.bob.ticket;

public class ElderTicket extends Ticket{
    public ElderTicket(Station start,Station destination,int number){
        super(start,destination,number);
    }

    @Override
    public int price() {
        super.price();
        price=price/2;
        return price;
    }

    @Override
    public String type() {
        return type="elder";
    }
}
