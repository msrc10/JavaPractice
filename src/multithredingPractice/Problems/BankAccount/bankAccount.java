package multithredingPractice.Problems.BankAccount;

import java.util.concurrent.*;

public class bankAccount {

    public static void main(String[] Args) throws InterruptedException, ExecutionException {
        long start = System.currentTimeMillis();

        ExecutorService exsev = Executors.newFixedThreadPool(1000);
        balance balance = new balance();

        deposit dep = new deposit(balance, 1000);
        withdraw with = new withdraw(balance, 500);

        for (int i = 0; i < 1000; i++) {
            exsev.submit(dep);
            exsev.submit(with);
        }

        exsev.shutdown(); // this means donot accept any new task and execute the existing ones.
        exsev.awaitTermination(1, TimeUnit.MINUTES);
        // this tells the main thread wait until the other threads completes the task

        long end = System.currentTimeMillis();

        System.out.println(balance.amount);
        System.out.println("Time: " + (end - start) + " ms");

    }
}
