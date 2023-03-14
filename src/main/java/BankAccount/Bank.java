package BankAccount;

import java.util.ArrayList;

public class Bank extends BankAccount implements Actions{

    public String name;
    public ArrayList<String> accounts = new ArrayList<>();
    public double d;


    public Bank(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    /**
     * adding new accounts
     */

    @Override
    public void addAccounts() throws IncorrectAccount {
        try {
            if (accountNumber.length() > 0 && accountNumber instanceof String){
                accounts.add(accountNumber);
            }if (holderName.length() > 0 && holderName instanceof String){
                accounts.add(holderName);
            }if (balance >= 0 ){
                accounts.add(String.valueOf(balance));
            }
        } catch (Exception e) {
            throw new IncorrectAccount("Karen you have to write valid informationg");
        }
    }


    /**
     * openning accounts
     * @param accNumber
     * @param name
     * @param balance
     */

    public void openAccount(String accNumber, String name, double balance) throws IncorrectAccount {
        BankAccount accounts = new BankAccount(accNumber, name, balance);
        addAccounts();
    }

    /**
     * closing an account
     * @param accountNumber
     */

    public void closeAccount(String accountNumber) {
        super.accountNumber = accountNumber;
        for (int i = 0; i < accounts.size(); i++) {
            accounts.remove(accountNumber);
        }
    }

    /**
     * calling parent's deposit method
     * @param accountNumber
     * @param amount
     */

    public void depositAmount(String accountNumber, double amount) throws NegativeAmount {
        super.deposit(amount);

    }

    /**
     * calling Parent's witdraw method
     * @param accountNumber
     * @param amount
     * @throws IncorrectAmount
     */

    public void withdrawAmount(String accountNumber, double amount) throws IncorrectAmount {
        super.withdraw(amount);
    }

    /**
     * receiving total balance from bank
     * @return
     */

    public double getTotalBalance() {
        double sumBalance = 0.0;
        for (String i : accounts) {
            Double d = Double.valueOf(i);
            sumBalance +=d;
        }
        return sumBalance;
    }



}