package BankAccount;

public class NegativeAmount extends Exception {
    public NegativeAmount(String errMessage) {
        super(errMessage);
    }
}
