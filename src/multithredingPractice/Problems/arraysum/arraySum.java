package multithredingPractice.Problems.arraysum;

import java.util.*;
import java.util.concurrent.*;

public class arraySum implements Callable<Integer> {
    List<Integer>list;
    int start;
    int  end;

    public arraySum(List<Integer>list, int start, int end){
        this.list = list;
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {

        int sum = 0;

        for(int i=start;i<=end;i++){
            sum += list.get(i);
        }

        System.out.println(sum);
        return sum;
    }
    
}
