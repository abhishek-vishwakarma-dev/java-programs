//Enscapsulation

public class Demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(5000);
        System.out.println(ba.getBalance());

        ba.withdraw(4000);
        System.out.println(ba.getBalance());
    }

}

class BankAccount {
    private double balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    // getters / setters
    public double getBalance() {
        return balance;
    }

}
