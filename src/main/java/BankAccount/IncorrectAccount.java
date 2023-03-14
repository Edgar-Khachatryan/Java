package BankAccount;

public class IncorrectAccount extends Exception{
    public IncorrectAccount(String errMessage){
        super(errMessage);
    }
}
