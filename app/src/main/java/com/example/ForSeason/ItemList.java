package com.example.ForSeason;

public class ItemList {

    String itemName;
    float itemPrice;
    float itemChange;
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

    public ItemList(String itemName, float itemPrice, float itemChange, String itemSeason) {
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

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public float getItemChange() {
        return itemChange;
    }

    public void setItemChange(float itemChange) {
        this.itemChange = itemChange;
    }

    public String getItemSeason() {
        return itemSeason;
    }

    public void setItemSeason(String itemSeason) {
        this.itemSeason = itemSeason;
    }
}
