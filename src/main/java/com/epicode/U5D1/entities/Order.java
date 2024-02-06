package com.epicode.U5D1.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
public class Order {

    private int idOrder;
    private OrderStato orderStato;
    private int numSeats;
    private LocalDate time;
    private List<Item> items;
    private int tot;

    public Order(int idOrder, String stato, int numSeats, LocalDate time, List<Item> items, int tot) {
        this.idOrder = idOrder;
        this.orderStato = orderStato;
        this.numSeats = numSeats;
        this.time = time;
        this.items = items;
        this.tot = tot;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", stato='" + orderStato + '\'' +
                ", numSeats=" + numSeats +
                ", time=" + time +
                ", items=" + items +
                ", tot=" + tot +
                '}';
    }

    public void printOrder(){

    }
}
