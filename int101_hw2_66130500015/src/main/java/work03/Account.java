package work03;

import work01.Utilitor;
import work02.Person;

public class Account {
    //3.2
    private static long nextNo = 100_000_000;
    //3.3
    private final long no;
    //3.4
    private Person owner;
    //3.5
    private double balance;
    //3.6

    public Account(Person owner) {
        if (owner == null) {
            throw new NullPointerException();

        }
        this.owner = owner;
        this.no = nextNo + Utilitor.computelsbn10(nextNo);
        nextNo += 10;
        this.balance = 0.0;
    }
    //3.7


    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    //3.8
    public double deposit(double amount) {
        this.balance += Utilitor.testPositive(amount);
        return this.balance;
    }

    //3.9
    public double withdraw(double amount) {
        this.balance = Utilitor.testPositive(this.balance) - Utilitor.testPositive(amount);
        {
            return this.balance;
        }

    }

    public double transfer(double amount, Account account) {
        if (account == null) {
            throw new IllegalArgumentException();
        }
        this.withdraw(amount);
        account.deposit(amount);

        return amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account(");
        sb.append(this.no);
        sb.append(",");
        sb.append(this.balance);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}
