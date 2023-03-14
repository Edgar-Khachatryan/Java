package BankAccount;

public interface Actions {

    double deposit(double amount) throws NegativeAmount;

    double withdraw(double amount) throws IncorrectAmount;

    double checkBalance(double currentBalance);

     void addAccounts() throws IncorrectAccount;


}
