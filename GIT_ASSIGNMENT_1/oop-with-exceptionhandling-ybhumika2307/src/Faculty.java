public class Faculty extends Person {

    Faculty(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void purchase(FoodItem item, int quantity)
            throws InsufficientBalanceException, InvalidQuantityException {

        System.out.println("\nFaculty purchase:");

        if (quantity <= 0) {
            throw new InvalidQuantityException("Quantity should be greater than 0");
        }

        double total = item.price * quantity;
        double finalAmount = total - (total * 0.10);

        if (balance < finalAmount) {
            throw new InsufficientBalanceException("Not enough balance");
        }

        balance = balance - finalAmount;

        System.out.println(name + " bought " + quantity + " " + item.name);
        System.out.println("Original amount: Rs. " + total);
        System.out.println("After 10% discount: Rs. " + finalAmount);
        System.out.println("Balance left: Rs. " + balance);
    }
}