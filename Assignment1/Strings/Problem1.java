/*write a java program to Replace a character 
at a specific index in a String in Java. */

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = scanner.nextLine();

        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        System.out.print("Enter the character to replace: ");
        char replace = scanner.next().charAt(0);

        String res = new String();

        for (int i = 0; i < input.length(); i++) {
            if (i == index)
                res += replace;
            else
                res += input.charAt(i);
        }
        System.out.println(res);

        scanner.close();

    }
}
