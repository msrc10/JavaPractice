package InventoryManagement;

public class Item implements Comparable<Item> {
    public String id;
    private String name;
    private double price;
    private int quantity;

    public Item(String id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item o) {
        return this.name.compareTo(o.name);
    }

}
