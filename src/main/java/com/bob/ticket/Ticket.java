package com.bob.ticket;

public class Ticket {
    public static final int TAIPEI_CITY=1;
    public static final int TAICHUNG_CITY=2;
    public static final int KAOHSIUNG_CITY=3;
    Station start;
    Station destination;
    int number;
    int price;
    String type;

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
        else if(start==Station.TAICHUNG){
            if(destination==Station.TAIPEI_CITY){
                price=600*number;
            }
            else{
                price=900*number;
            }
        }
        return price;
    }
    public String type(){
        return type="normal";
    }
    public void print(){
        if (start == Station.TAIPEI_CITY){
            if(destination==Station.TAICHUNG){
                System.out.println("Taipei-Taichung type:"+type()+" ticket:"+number+" price:"+price());
            }
            else{
                System.out.println("Taipei-Kaohsiung type:"+type()+" ticket:"+number+" price:"+price());
            }
        }
        else if(start==Station.KAOHSIUNG){
            if(destination==Station.TAICHUNG){
                System.out.println("Kaohsiung-Taichung type:"+type()+" ticket:"+number+" price:"+price());
            }
            else{
                System.out.println("Kaohsiung-Taipei type:"+type()+" ticket:"+number+" price:"+price());
            }
        }
        else if(start==Station.TAICHUNG){
            if(destination==Station.TAIPEI_CITY){
                System.out.println("Taichung-Taipei type:"+type()+" ticket:"+number+" price:"+price());
            }
            else{
                System.out.println("Taichung-Kaohsiung type:"+type()+" ticket:"+number+" price:"+price());
            }
        }

    }

}
