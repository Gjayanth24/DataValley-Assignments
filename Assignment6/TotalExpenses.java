/* While purchasing certain items, a discount of 10% is offered 
if the quantity purchased is more than 50. 
If the quantity purchased is between 25 and 50 (inclusive),
a discount of 5% is offered. If the quantity purchased is less than 25, 
a discount is offered. Write a program to calculate the total expenses 
given the quantity and price per item entered through the keyboard. */

import java.util.Scanner;

class TotalExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = quantity * pricePerItem;

        double discount = 0;
        if (quantity > 50) {
            discount = totalExpenses * 0.10; 
        } else if (quantity >= 25 && quantity <= 50) {
            discount = totalExpenses * 0.05; 
        }

        double finalTotalExpenses = totalExpenses - discount;

        System.out.println("Total expenses: Rs." + totalExpenses);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Final total expenses after discount: Rs." + finalTotalExpenses);

        scanner.close();
    }
}