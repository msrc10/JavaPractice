package multithredingPractice.adderSubtractor;

public class Client {
    public static void main(String[] Args) throws InterruptedException {

        // tried passing int count=0 and Integer Count=0 here
        // for int since it is primitive it is passes by reference
        //Here Integer is immutable
        //So created a custom class and object which mutable and passed by reference

        count count = new count();

        adder adder = new adder(count);
        subtractor sub = new subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(sub);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println(count.value);
    }
}
