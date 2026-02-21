package multithredingPractice.Problems.BankAccount;


public class deposit implements Runnable {
    balance bal;
    int amount;

    deposit(balance bal, int amount) {
        this.bal = bal;
        this.amount = amount;
    }

    @Override
    public void run() {
    synchronized(bal){
        bal.amount += amount;
    }
  }

}
