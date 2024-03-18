
/* write a java program to count the 
number of vowels and consonants in a given string .
 */
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u')
                vowels += 1;
            else
                consonants += 1;
        }
        System.out.println("Vowels : " + vowels + ", Consonants : " + consonants);

        scanner.close();
    }
}
