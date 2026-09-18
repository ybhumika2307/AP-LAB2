public class Student extends Person {

    Student(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void purchase(FoodItem item, int quantity)
            throws InsufficientBalanceException, InvalidQuantityException {

        System.out.println("\nStudent purchase:");

        if (quantity <= 0) {
            throw new InvalidQuantityException("Quantity should be greater than 0");
        }

        double total = item.price * quantity;

        if (balance < total) {
            throw new InsufficientBalanceException("Not enough balance");
        }

        balance = balance - total;

        System.out.println(name + " bought " + quantity + " " + item.name);
        System.out.println("Amount paid: Rs. " + total);
        System.out.println("Balance left: Rs. " + balance);
    }
}