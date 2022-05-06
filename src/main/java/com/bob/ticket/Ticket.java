package com.bob.ticket;

public class Ticket {
    public static final int TAIPEI_CITY=100;
    public static final int TAICHUNG_CITY=200;
    public static final int KAOHSIUNG_CITY=300;
    Station start;
    Station destination;
    int number;
    int price;
    String type;

    public Ticket(Station start,Station destination,int number) {
       this.start=start;
       this.destination=destination;
       this.number=number;

       int diff =Math.abs(start.id-destination.id);
       switch (diff){
           case 100:
               price=500;
               break;
           case 200:
               price=600;
               break;
           case 300:
               price=1100;
               break;
       }

        if (start == Station.TAIPEI_CITY){
            if(destination==Station.TAICHUNG){
                price=500;
            }
            else{
                price=1100;
            }
        }
        else if(start==Station.KAOHSIUNG){
            if(destination==Station.TAICHUNG){
                price=600;
            }
            else{
                price=1100;
            }
        }
        else if(start==Station.TAICHUNG){
            if(destination==Station.TAIPEI_CITY){
                price=500;
            }
            else{
                price=600;
            }
        }
    }
    public int price(){
        return price*number;
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
