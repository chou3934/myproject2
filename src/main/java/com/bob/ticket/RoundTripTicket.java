package com.bob.ticket;

public class RoundTripTicket extends Ticket{
    public RoundTripTicket(Station start,Station destination,int number){
        super(start,destination,number);
    }

    @Override
    public int price() {
        super.price();
        price=price*2/5*3;
        return price;
    }
}
