package multithredingPractice.Assignment;

import java.util.*;
import java.util.concurrent.*;

public class client {

    public static void main(String[] Args) throws InterruptedException, ExecutionException {

        ExecutorService exSev = Executors.newFixedThreadPool(50);

        fibonacci fib = new fibonacci(exSev, 5);

        Future<Integer> future = exSev.submit(fib);

        System.out.println(future.get());

        List<Integer> list = new ArrayList<>(List.of(3, 2, 5, 4, 1));
        
        MergeSort ms = new MergeSort(exSev, list);

        Future<List<Integer>> fu = exSev.submit(ms);

        System.out.println(fu.get());

    }

}
