//Print odd position characters

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String input = scanner.nextLine();
        char[] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 != 0 && ch[i] != ' ')
                System.out.print(ch[i]);
        }
        scanner.close();
    }

}
