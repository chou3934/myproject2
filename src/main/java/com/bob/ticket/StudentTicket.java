package com.bob.ticket;

public class StudentTicket extends Ticket{
    public StudentTicket(Station start,Station destination,int number){
        super(start,destination,number);
    }

    @Override
    public int price() {
        super.price();
        price=price/5*4;
        return price;
    }
}
