package multithredingPractice.adderSubtractor;

public class adder implements Runnable {
   private count count;

   public adder(count count){
     this.count = count;
   }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            count.value+=i;
        }
    }
    
}
