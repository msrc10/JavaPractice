package InventoryManagement;

import java.util.*;

public class client {
    public static void main(String[] args) {
        IMS<Book> bookstore = new IMS<>();
        IMS<Electronics> elecstore = new IMS<>();
        

        Orders order1 = new Orders("dadvfdv", true);
        Orders order2 = new Orders("sdcsd", false);
        Orders order3 = new Orders("dadvfdv", true);
        Orders order4 = new Orders("dadvfdv", true);
        Orders order5 = new Orders("adsfadsfv", true);
        Orders order6 = new Orders("gfdhgvn", false);
        Orders order7 = new Orders("dcgcvjh", false);
        Orders order8 = new Orders("dfjdg", false);



        // very Important revise these comparing and compare to properly
        PriorityQueue<Orders> orderQueue =
                new PriorityQueue<>(Comparator.comparing(Orders::getExpress).reversed()
                        .thenComparing(Orders::getOrderId));

        orderProcessor op = new orderProcessor(orderQueue);
        op.addOrder(order1);
    }
}


/*
| Type          | How to Compare            |
| ------------- | ------------------------- |
| int           | `Integer.compare(a, b)`   |
| long          | `Long.compare(a, b)`      |
| double        | `Double.compare(a, b)`    |
| String        | `a.compareTo(b)`          |
| LocalDate     | `a.compareTo(b)`          |
| Custom object | must implement Comparable |
 */


//For iterating in map
//| What you want | Use                |
//| ------------- | ------------------ |
//| All values    | `store.values()`   |
//| All keys      | `store.keySet()`   |
//| Both          | `store.entrySet()` |


/*
| Feature        | Queue | Deque | LinkedList | ArrayDeque | PriorityQueue |
| -------------- | ----- | ----- | ---------- | ---------- | ------------- |
| FIFO           | ✅     | ✅     | ✅          | ✅          | ❌      |
| Double ended   | ❌     | ✅     | ✅          | ✅          | ❌      |
| Stack ops      | ❌     | ✅     | ✅          | ✅          | ❌      |
| Random access  | ❌     | ❌     | ✅          | ❌          | ❌      |
| Priority order | ❌     | ❌     | ❌          | ❌          | ✅      |
*/
