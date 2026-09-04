public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        // TODO: add the amount to the balance
    }

    public boolean withdraw(double amount) {
        amount += 2; //apply fee first
        if (balance - amount < 50){return false;}
        balance -= amount;
        return true;
    }
    
    public String getAccountSummary() {
        return accountHolder + ": $" + balance;
    }
}