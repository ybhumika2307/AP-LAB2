public class Main {

    public static void main(String[] args) {

        FoodItem pizza = new FoodItem("Pizza", 100);
        FoodItem sandwich = new FoodItem("Sandwich", 60);
        FoodItem coffee = new FoodItem("Coffee", 40);

        Student student = new Student("Rahul", 500);
        Student student2 = new Student("Aman", 150);

        Faculty faculty = new Faculty("Dr Sharma", 500);

        Person p;

        p = student;

        try {
            p.purchase(pizza, 2);
        } catch (InsufficientBalanceException | InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        p = student2;

        try {
            p.purchase(pizza, 2);
        } catch (InsufficientBalanceException | InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        p = faculty;

        try {
            p.purchase(sandwich, 2);
        } catch (InsufficientBalanceException | InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        p = student;

        try {
            p.purchase(coffee, 0);
        } catch (InsufficientBalanceException | InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}