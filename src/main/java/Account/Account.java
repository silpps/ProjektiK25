package Account;

public class Account {
    double balance;

    public Account(){
        this.balance = 0;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public double withdraw(double amount) {
        if ((balance - amount) < 0) {
            System.out.println("Insufficient funds");
            return 0;
        } else {
            balance -= amount;
            return amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
