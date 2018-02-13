package com.supermarket;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Item {
    // with IRegister you want to calculate the promotionPrice and fullPrice, remember
    private int promotionPrice;
    private int fullPrice;

    // what is on the list for the customer to buy with the name of the item, the price, and the promotional deal
    private String itemName;
    private int itemPrice;
    private int itemPromotionPrice;
    private int itemPromotionAmount;


    // items to add into the list for sale
    public Item(String itemName, int itemPrice, int itemPromotionPrice, int itemPromotionAmount ) {
        this.itemPromotionPrice = itemPromotionPrice;
        this.itemPromotionAmount = itemPromotionAmount;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    // you need an arrayList Item of ItemName, Price, Promotion Price, promotion amount for the customer to see
    ArrayList<Item> itemList = new ArrayList<Item>();

    // All the getters and setters
    public int getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(int promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemPromotionPrice() {
        return itemPromotionPrice;
    }

    public void setItemPromotionPrice(int itemPromotionPrice) {
        this.itemPromotionPrice = itemPromotionPrice;
    }

    public int getItemPromotionAmount() {
        return itemPromotionAmount;
    }

    public void setItemPromotionAmount(int itemPromotionAmount) {
        this.itemPromotionAmount = itemPromotionAmount;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
}
