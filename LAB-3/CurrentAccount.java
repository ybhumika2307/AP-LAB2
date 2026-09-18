class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 1000.0;

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void withdraw(double amt) {
        if (balance - amt < -OVERDRAFT_LIMIT) {
            System.out.println("Error: Withdrawal exceeds overdraft limit of " + OVERDRAFT_LIMIT);
        } else {
            balance -= amt;
        }
    }
}