package com.bob.ticket;

public class Ticket {
    public static final int TAIPEI_CITY=1;
    public static final int TAICHUNG_CITY=2;
    public static final int KAOHSIUNG_CITY=3;
    Station start;
    Station destination;
    int number;
    int price;

    public Ticket(Station start,Station destination,int number) {
       this.start=start;
       this.destination=destination;
       this.number=number;
    }
    public int price(){
        if (start == Station.TAIPEI_CITY){
            if(destination==Station.TAICHUNG){
                price=600*number;
            }
            else{
                price=1500*number;
            }
        }
        else if(start==Station.KAOHSIUNG){
            if(destination==Station.TAICHUNG){
                price=900*number;
            }
            else{
                price=1500*number;
            }
        }
        return price;
    }
    public void print(){
        if (start == Station.TAIPEI_CITY){
            if(destination==Station.TAICHUNG){
                System.out.println("Taipei-Taichung "+"ticket:"+number+" "+"price:"+price());
            }
            else{
                System.out.println("Taipei-Kaohsiung "+"ticket:"+number+" "+"price:"+price());
            }
        }
        else if(start==Station.KAOHSIUNG){
            if(destination==Station.TAICHUNG){
                System.out.println("Kaohsiung-Taichung "+"ticket:"+number+" "+"price:"+price());
            }
            else{
                System.out.println("Kaohsiung-Taipei "+"ticket:"+number+" "+"price:"+price());
            }
        }

    }

}
