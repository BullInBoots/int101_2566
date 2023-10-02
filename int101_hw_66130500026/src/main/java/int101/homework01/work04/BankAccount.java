/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package int101.homework01.work04;

/**
 *
 * @author boolin
 */
public class BankAccount {
    // Field
    private int number;
    private Person owner;
    private double balance;
    
    // Constructor
    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
        this.balance = 0;
    }
    
    public Person getOwner() {
        return this.owner;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public double deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return this.balance;
        } else {
            return this.balance;
        }
    }
    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }
    public void transfer(double amount, BankAccount account) {
        if (this.balance < amount) {
            System.out.println("Error : Your balance is not enough to transfer");
        } else {
            this.withdraw(amount);
            account.deposit(amount);
        }
    }
    
    @Override
    public String toString() {
        return "BankAccount(" + this.number + ")";
    }
}
