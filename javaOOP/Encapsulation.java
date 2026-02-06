class BankAccount {
  private double balance;

  // deposit method
   void deposit(double amount) {
    balance += amount;
  }

  // withdraw method
   void withdraw(double amount) {
    if(amount <= balance) {
        balance -= amount;
    } else {
      System.out.println("Not enough balance!");
    }
  }

  // check balance
  double getBalance() {
    return balance;
  }
}

public class Encapsulation {
    public static void main(String[] args) {
      BankAccount acc = new BankAccount();
      acc.deposit(1000);
      acc.withdraw(300);
      System.out.println("Balance = " + acc.getBalance());
    }
}