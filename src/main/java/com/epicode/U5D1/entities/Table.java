package com.epicode.U5D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Table {
    private int IdTable;
    private int numSeats;
    private boolean stato;

    public Table(int idTable, int numSeats, boolean stato) {
        IdTable = idTable;
        this.numSeats = numSeats;
        this.stato = true;
    }

    public void statoTable(){
       if (stato == true) {
           System.out.print("Il tavolo " + getIdTable() + "è libero.");
       //   printOrder();
       } else {
           System.out.println("Il tavolo " + getIdTable() + "è occupato.");
       }
    }

}
