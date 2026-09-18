[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/rqBAYtrl)
# Java Lab: University Cafeteria Management System

## Objective

Develop a simple University Cafeteria Management System using:

- Inheritance
- Method overriding
- Runtime polymorphism
- Custom checked exceptions
- `try-catch`
- `throw`
- `throws`

## Problem Statement

The university cafeteria serves two types of customers:

- Students
- Faculty members

Both can purchase food items. However, faculty members receive a 10% discount, while students pay the normal price.

### Requirements

#### 1. Person class

Create a base class `Person` containing:

- `name`
- `balance`

Create a method:

```java
purchase(FoodItem item, int quantity)
```

The method should represent the purchase operation.

#### 2. Student class

Create `Student` extending `Person`.

Override `purchase()`.

Students pay the normal price.

#### 3. Faculty class

Create `Faculty` extending `Person`.

Override `purchase()`.

Faculty members receive a 10% discount on the total bill.

Example:

```text
Food price = ₹100
Quantity = 2
Normal bill = ₹200
Faculty bill = ₹180
```

#### 4. FoodItem class

Create `FoodItem` containing:

- `name`
- `price`

Create at least three food items, such as:

```text
Pizza       ₹100
Sandwich     ₹60
Coffee       ₹40
```

## Exception Handling Requirements

### InsufficientBalanceException

Create a custom **checked exception** named:

```text
InsufficientBalanceException
```

If the customer does not have enough balance, throw this exception.

Example:

```text
Student balance = ₹150
Pizza price = ₹100
Quantity = 2
Total = ₹200
```

### InvalidQuantityException

Create another custom **checked exception** named:

```text
InvalidQuantityException
```

If:

```text
quantity <= 0
```

throw this exception.

## Main Program

In `main()`:

1. Create at least one Student.
2. Create at least one Faculty member.
3. Create at least three FoodItem objects.
4. Demonstrate a successful student purchase.
5. Demonstrate insufficient student balance.
6. Demonstrate a faculty purchase with the 10% discount.
7. Demonstrate an invalid quantity.
8. Handle exceptions using `try-catch`.

## Polymorphism Requirement

Demonstrate runtime polymorphism using a parent-class reference:

```java
Person p;

p = new Student(...);
p.purchase(...);

p = new Faculty(...);
p.purchase(...);
```

The appropriate overridden `purchase()` method should execute.

## Important Instructions

1. Do not use file handling.
2. Do not use a database.
3. Use custom exceptions rather than only printing error messages.
4. `InsufficientBalanceException` and `InvalidQuantityException` must be checked exceptions.
5. Use `throw` to generate exceptions.
6. Use `throws` where required.
7. Use `try-catch` in the calling code.
8. Demonstrate inheritance, overriding, and runtime polymorphism clearly.

## Challenge

Add one more custom exception of your choice, such as:

```text
InvalidFoodItemException
```

Decide when it should be generated and handle it appropriately.

## Submission

Your repository should contain the Java source files required to compile and run the program.

Suggested files:

```text
Main.java
Person.java
Student.java
Faculty.java
FoodItem.java
InsufficientBalanceException.java
InvalidQuantityException.java
```
