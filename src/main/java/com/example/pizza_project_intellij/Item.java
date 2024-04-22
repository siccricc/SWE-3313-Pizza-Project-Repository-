package com.example.pizza_project_intellij;

import java.util.ArrayList;
import java.util.List;

public class Item {
    //General item info
    static int itemId = 0;
    int amount;

    //Pizza and Drinks
    String pizzaSize;
    String pizzaCrust;
    String Toppings;

    public static int getItemId() {
        return itemId;
    }

    public static void setItemId(int itemId) {
        Item.itemId = itemId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getPizzaCrust() {
        return pizzaCrust;
    }

    public void setPizzaCrust(String pizzaCrust) {
        this.pizzaCrust = pizzaCrust;
    }

    public String getToppings() {
        return Toppings;
    }

    public void setToppings(String toppings) {
        Toppings = toppings;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(String orderHistory) {
        this.orderHistory = orderHistory;
    }

    String drinkSize;
    String drinkType;

    //Order Info
    int orderID;
    String orderHistory;

    //Constructors

    //Methods
    
}
