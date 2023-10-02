/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;

public class BankAccount {
    private int number;
    private Person owner;
    private double balance;
    
    public BankAccount(int number,Person owner){
        this.number=number;
        this.owner=owner;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
     
    public double deposit(double amount){
        this.balance=this.balance + amount;
        return this.balance;
    }
    public double withdraw(double amount){
       return this.balance= this.balance - amount;
        
    }
    public void transfer(double amount,BankAccount account){
        this.balance=this.balance - amount;
        account.deposit(amount);
        
    }
    @Override
    public String toString(){
        return "BankAccount("+this.number+")";
    }
    
    
    
}
