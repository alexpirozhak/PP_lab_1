public class BankAccount {
    private String accountNumber;

    private int bankId;

    private int userId;

    private double balance;

    public BankAccount(String accountNumber, int bankId, int userId) {
        this.accountNumber = accountNumber;
        this.bankId = bankId;
        this.userId = userId;
        balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBankId() {
        return bankId;
    }

    public int getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
