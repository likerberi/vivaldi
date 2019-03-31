package com.example.ForSeason;

public class ItemList {

    String itemName;
    String itemPrice;
    String itemChange;
    String itemSeason;

    @Override
    public String toString() {
        return "ItemList{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemChange=" + itemChange +
                ", itemSeason='" + itemSeason + '\'' +
                '}';
    }

    public ItemList(String itemName, String itemPrice, String itemChange, String itemSeason) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemChange = itemChange;
        this.itemSeason = itemSeason;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemChange() {
        return itemChange;
    }

    public void setItemChange(String itemChange) {
        this.itemChange = itemChange;
    }

    public String getItemSeason() {
        return itemSeason;
    }

    public void setItemSeason(String itemSeason) {
        this.itemSeason = itemSeason;
    }
}
