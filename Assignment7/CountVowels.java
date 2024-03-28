/*
Write a Java program to check if a vowel is present in a string. 
Additionally, the program should count the total number of vowels present and
display the count along with whether any vowels are present or not.
*/

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a String : ");
        String name = scanner.nextLine().toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
                    || name.charAt(i) == 'u') {
                count += 1;
            }
        }
        if (count > 0)
            System.out.println("Vowels are present in the given String and the count is : " + count);
        else
            System.out.println("Vowels are not present in the given String");

            scanner.close();
    }

}
