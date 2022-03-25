package com.bob.highSpeedRail;

import java.util.Scanner;

public class Machine {

    public static void main(String[] args) {
        Ticket ticket=new Ticket(Station.TAIPEI_CITY,Station.KAUHSUING,2);
        System.out.println("Your start station(Taipei:1,Taichung=2,Kaohsiung=3)");
        Scanner scanner=new Scanner(System.in);
        int choice=Integer.parseInt(scanner.next());
        Station startStation=null;
        switch(choice){
            case 1:
                startStation=Station.TAIPEI_CITY;
                break;
            case 2:
                startStation=Station.TAICHUNG;
                break;
            case 3:
                startStation=Station.KAUHSUING;
                break;
        }
        System.out.println("Your destination station(Taipei:1,Taichung=2,Kaohsiung=3)");
        Scanner scanner2=new Scanner(System.in);
        int choice2=Integer.parseInt(scanner.next());
        Station destinationStation=null;
        switch(choice2){
            case 1:
                destinationStation=Station.TAIPEI_CITY;
                break;
            case 2:
                destinationStation=Station.TAICHUNG;
                break;
            case 3:
                destinationStation=Station.KAUHSUING;
                break;
        }
        System.out.println("How many ticket do you want: ");
        Scanner s=new Scanner(System.in);
        int number=Integer.parseInt(s.next());
        Ticket ticket1=new Ticket(startStation,destinationStation,number);
        ticket1.print();
    }
}
