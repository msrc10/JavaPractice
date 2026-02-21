package multithredingPractice.Problems.BankAccount;

public class withdraw implements Runnable {
    balance bal;
    int amount;

    withdraw(balance bal, int amount) {
        this.bal = bal;
        this.amount = amount;
    }

    @Override
    public void run() {
        synchronized(bal){
        bal.amount -= amount;
        }
    }
}
