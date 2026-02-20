package multithredingPractice.Assignment;

import java.util.concurrent.*;

public class fibonacci implements Callable<Integer> {

    int value;
    ExecutorService exsev;

    public fibonacci(ExecutorService exsev, int val) {
        this.exsev = exsev;
        this.value = val;
    }

    @Override
    public Integer call() throws Exception {
        if(value<=2){
            return value;
        }

        Future<Integer>n1 = exsev.submit(new fibonacci(exsev,value-1));
        Future<Integer>n2 = exsev.submit(new fibonacci(exsev,value-2));

        return n1.get() + n2.get();

    }

}
