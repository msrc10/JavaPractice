package InventoryManagement;

import java.util.PriorityQueue;

public class orderProcessor {
    PriorityQueue<Orders>orderQueue;

    public orderProcessor(PriorityQueue<Orders>orderQueue){
        this.orderQueue = orderQueue;
    }

    public void addOrder(Orders order){
        orderQueue.add(order);
    }

    public void processOrder(){
        orderQueue.poll();
    }
}
