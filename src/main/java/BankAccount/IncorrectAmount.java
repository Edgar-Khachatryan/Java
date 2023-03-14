package BankAccount;

public class IncorrectAmount extends Exception{
    public IncorrectAmount(String errMessage){
        super(errMessage);
    }
}

