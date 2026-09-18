public class Person {
    String name;
    double balance;

    Person(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void purchase(FoodItem item, int quantity)
            throws InsufficientBalanceException, InvalidQuantityException {

        if (quantity <= 0) {
            throw new InvalidQuantityException("Quantity should be greater than 0");
        }

        double total = item.price * quantity;

        if (balance < total) {
            throw new InsufficientBalanceException("Not enough balance");
        }

        balance = balance - total;

        System.out.println(name + " bought " + quantity + " " + item.name);
        System.out.println("Total amount: Rs. " + total);
        System.out.println("Balance left: Rs. " + balance);
    }
}