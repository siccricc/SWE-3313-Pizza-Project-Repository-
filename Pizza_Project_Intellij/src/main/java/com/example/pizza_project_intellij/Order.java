package com.example.pizza_project_intellij;

import java.time.*;
import java.util.*;

public class Order{
    static int orderId = 0;
    boolean takeout;

    //Customer Info
    int customerID;
    String customerAddress;
    LocalDateTime currentDateTime;

    //Items
    List<Item> items = new ArrayList<Item>();

    //Getters and Setters
    public boolean isTakeout() {
        return this.takeout;
    }

    public void setTakeout(boolean takeout) {
        this.takeout = takeout;
    }

    //Constructor
    public Order(Customer customer){
        orderId++;
        customerID = customer.getCustomerID();
        
    }

    // Methods 
    public List<Item> addItem(Item newItem){
        items.add(newItem);

        return items;
    }
    public List<Item> removeItem(Item newItem){
        items.remove(newItem);
        return items;
    }
}
