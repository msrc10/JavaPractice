package InventoryManagement;

import java.util.*;

public class IMS<T extends Item>{
    HashMap<String, T >store;
    List<T>viewList;//for recently viewed

    public IMS(){
        this.store = new HashMap<String,T>();
        this.viewList = new LinkedList<>();
    }

    public void addItem(T item){
        store.put(item.id,item);
    }

    public void removeItem(String id){
        store.remove(id);
    }

    public T getItem(String id){
        T item = store.get(id);
        addToRecentlyViewed(item);
        return item;
    }

    public List<T> getAllItems(){
        List<T>res = new ArrayList<>();
        
        for(T t:store.values()){
            res.add(t);
        }
        return res;
    }

    //Recently viwed logic 
    public void addToRecentlyViewed(T item){
        viewList.remove(item);
        viewList.add(item);
        if(viewList.size()>10){
            viewList.removeLast();
        }
    }

    public List<T> getRecentlyViewed(){
        return new ArrayList<>(viewList);
    }


    public void orderItem(T item){
        
    }
}

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

