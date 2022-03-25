package com.bob.highSpeedRail;

public class Ticket {
    public static final int TAIPEI_CITY=1;
    public static final int TAICHUNG_CITY=2;
    public static final int KAUHSIUNG_CITY=3;
    Station start;
    Station destination;
    int number;

    public Ticket(Station start,Station destination,int number) {
       this.start=start;
       this.destination=destination;
       this.number=number;
    }
    public void print(){
        if (start == Station.TAIPEI_CITY){
            if(destination==Station.TAICHUNG){
                System.out.println("Taipei-Taichung "+"ticket:"+number+" "+"price:"+600*number);
            }
            else{
                System.out.println("Taipei-Kaohsiung "+"ticket:"+number+" "+"price:"+1500*number);
            }
        }
        else if(start==Station.KAUHSUING){
            if(destination==Station.TAICHUNG){
                System.out.println("Kaohsiung-Taichung "+"ticket:"+number+" "+"price:"+900*number);
            }
            else{
                System.out.println("Kaohsiung-Taipei "+"ticket:"+number+" "+"price:"+1500*number);
            }
        }

    }
}
