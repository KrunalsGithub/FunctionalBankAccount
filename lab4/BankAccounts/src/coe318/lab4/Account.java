package coe318.lab4;

//Variables are declared
public class Account {
    private String name;
    private int number;
    private double balance;

    //Constructor creates a new account and initializes its details
    public Account(String name, int number, double initialBalance) {
        this.name = name;
        this.number = number;
        this.balance = initialBalance;
    }
    
    //Getter gets the owner's name
    public String getName() {
        return name;
    }
    //Getter gets the balance 
    public double getBalance() {
        return balance;
    }
    //Getter gets the account number
    public int getNumber() {
        return number;
    }
    //Allows a specified amount to be deposited
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
    
    //Allows a specified amount to be withdrawn
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + getName() + ", " + getNumber() + ", " + String.format("$%.2f", getBalance()) + ")";
    }
}
