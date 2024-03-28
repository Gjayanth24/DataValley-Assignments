/* A library charges a fine for every book returned late. For the first 7 days, 
the fine is 50 paise, for 8-14 days the fine is one rupee, and above 14 days fineis 5 rupees. 
If you return the book after 21 days, your membership will be canceled. 
Write a program to accept the number of days the member is late to 
return the book and display the fine or the appropriate message.
*/

import java.util.Scanner;

public class Fine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fine = 0;
        System.out.print("Enter the number of days late for returning the book: ");
        int daysLate = scanner.nextInt();
        if (daysLate <= 7) {
            fine = daysLate * 0.50;
        } else if (daysLate <= 14) {
            fine = 7 * 0.50 + (daysLate - 7) * 1;
        } else if (daysLate <= 21) {
            fine = 7 * 0.50 + 7 * 1 + (daysLate - 14) * 5;
        } else {
            System.out.println("Membership canceled! Book returned after 21 days.");
        }

        if (fine > 21)
            System.out.println("Fine: Rs. " + fine);

        scanner.close();
    }

}
