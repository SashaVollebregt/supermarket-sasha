package com.supermarket;

import java.util.ArrayList;

public abstract class Customer {
    private String nameCustomer;
    private int amountOfCustomer;

    // you want to know the number of items an the item chosen
    public abstract void greeting();

    // the customer needs to have a name
    public Customer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    // basketList of the customer where he or she can see
    ArrayList<Item> basketList = new ArrayList<Item>();

    // you want to go through the basketlist of the customer
    public abstract void printBasketList(ArrayList basketList);

    // add items in the basket and the amount
    public abstract void addItem(String itemName, int amountOfCustomer);

    // calculate the end price and use the IRegister
    public abstract void checkOut();

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getAmountOfItemsCustomerPicks() {
        return amountOfCustomer;
    }

    public void setAmountOfItemsCustomerPicks(int amountOfItemsCustomerPicks) {
        this.amountOfCustomer = amountOfItemsCustomerPicks;
    }

    public int getAmountOfCustomer() {
        return amountOfCustomer;
    }

    public void setAmountOfCustomer(int amountOfCustomer) {
        this.amountOfCustomer = amountOfCustomer;
    }

    public ArrayList<Item> getBasketList() {
        return basketList;
    }

    public void setBasketList(ArrayList<Item> basketList) {
        this.basketList = basketList;
    }
}
