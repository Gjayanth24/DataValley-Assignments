
/*
Write a Java program where the current year and the year in which an employee joined 
the organization are entered through the keyboard. 
If the number of years for which the employee has served the organization 
is greater than 5, a bonus of Rs. 5000/- is given to the employee. 
If the years of service are between 3 and 5 (inclusive), a bonus of Rs. 3000/- is given. 
If the years of service are less than 3, then the program 
should print a message indicating that no bonus is awarded.
*/
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentYear, joinedYear, bonus = 0, years;
        System.out.print("Enter the employee joined year : ");
        joinedYear = scanner.nextInt();

        System.out.print("Enter the employee current year : ");
        currentYear = scanner.nextInt();
        years = currentYear - joinedYear;

        if (years > 5)
            bonus += 5000;
        else if (years >= 3 && years <= 5)
            bonus += 3000;
        else if (years < 3)
            bonus = 0;

        if (bonus == 0)
            System.out.println("No bonus is awarded");
        else
            System.out.println("Your bonus is Rs." + bonus);
        scanner.close();

    }

}
