package coe318.lab4;

//Manages a bank that consists of multiple accounts
public class Bank {
    private String name; //Represents the bank name
    private Account[] accounts; //Array to store accounts
    private int numAccounts; //The number of active accounts

    //A new bank is created with a specified name and a specified max. number of accounts it is able to manage 
    public Bank(String name, int maxNumberAccounts) {
        //Initializes the bank details and account array
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }
    
    //Getter gets the name of the bank
    public String getName() {
        return name;
    }
     
    //Getter gets the number of open accounts in the bank 
    public int getNumAccounts() {
        return numAccounts;
    }
    
    //Getter gets an array of accounts managed by the bank
    public Account[] getAccounts() {
        return accounts;
    }
    
    //The code checks if the bank already has an account with the specified amount account number
    public boolean hasAccountNumber(int accountNumber) {
        for (Account account : accounts) {
            if (account != null && account.getNumber() == accountNumber) {
                return true;
            }
        }
        return false;
    }

    /*An account is added if possible. However if the account number already exists, it returns false. 
    If a or a maximum number of accounts has been reached by the bank, it adds it and then returns true.*/
    public boolean add(Account account) {
        if (numAccounts < accounts.length && !hasAccountNumber(account.getNumber())) {
            accounts[numAccounts] = account;
            numAccounts++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String s = getName() + ": " + getNumAccounts() + " of " + accounts.length + " accounts open";
        for (Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }
}
