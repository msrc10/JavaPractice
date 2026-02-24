package InventoryManagement;

import java.util.*;

public class Orders {
    private String orderId;
    private boolean isExpress;

    public Orders(String orderId, boolean isExpress){
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    public boolean getExpress(){
        return isExpress;
    }

    public String getOrderId(){
        return this.orderId;
    }

}
