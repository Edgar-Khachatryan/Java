package BankAccount;

public class BankAccount implements Actions{
    public String accountNumber;
    public String holderName;
    public double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    /**
     * overriden method deposit from Actions Interface
     * @param amount
     * @return
     */

    @Override
    public double deposit(double amount) throws NegativeAmount {
        try{
            if (amount > 0){
                System.out.println("Thanks for the deposit");
                return balance + amount;
            }
        }catch (Exception e){
            if (amount <=0){
                throw new NegativeAmount("You can't deposit negative amount Karen !");
            }
        }

        return balance;
    }
    /**
     * overriden method withraw from Actions Interface
     * @param amount
     * @return
     * @throws IncorrectAmount
     */

    @Override
    public double withdraw(double amount) throws IncorrectAmount {
        try {
            if (amount <= balance) {
                System.out.println("Take your money please");
                return balance - amount;
            }
        }catch (Exception e) {
            if (amount > balance){
                throw new IncorrectAmount("You don't have enough money" + balance);
            }
        }
        return amount;
    };


    /**
     * overriden method checkBalance from Actions Interface
     * @param currentBalance
     * @return
     */

    @Override
    public double checkBalance(double currentBalance){
        currentBalance = balance;
        System.out.println("You have" + currentBalance + "money in your account");
        return currentBalance;
    }

    @Override
    public void addAccounts() throws IncorrectAccount {

    }

}
