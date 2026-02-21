package multithredingPractice.Problems.arraysum;

import java.util.*;
import java.util.concurrent.*;

public class client {
    public static void main(String[] Args) throws InterruptedException, ExecutionException {

        // Generate 1 million random numbers
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(random.nextInt(100));
        }

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println(cores);

        ExecutorService exsev = Executors.newFixedThreadPool(cores);

        int chunkSize = list.size() / cores;

        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = start + chunkSize;

            arraySum sum = new arraySum(list, start, end);
            futures.add(exsev.submit(sum));
        }

        int finalSum = 0;
        for (Future<Integer> f : futures) {
            finalSum += f.get();
        }

        System.out.println(finalSum);
        exsev.shutdown();
    }
}
