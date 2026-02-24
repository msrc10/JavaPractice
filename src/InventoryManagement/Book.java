package InventoryManagement;

public class Book extends Item {
    String Author;

        public Book(String id, String name, double price, int quantity, String Author){
            super(id,name,price,quantity);
            this.Author = Author;
    }

}
