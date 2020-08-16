package com.company;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String name;
    private List<Seat> seats=new ArrayList<>();
    public Theatre(String name,int numRows,int seatsPerRow){
        this.name=name;
        int lastRow='A' +(numRows-1);
        for(char row='A';row<=lastRow;row++){
            for(int seatNum=1;seatNum<=seatsPerRow;seatNum++){
                Seat seat=new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }
    public boolean reserveSeat(String seatNumber){
        Seat reqSeat=null;
        for(Seat seat:seats){
            if(seat.)
        }
    }
}
