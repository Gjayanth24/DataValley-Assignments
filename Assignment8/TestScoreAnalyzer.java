
/*
Write a Java program that accepts a list of student test scores
and returns the number of students who scored above the
average, at the average, or below the average, and the median
score for each group.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestScoreAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter test score for student " + (i + 1) + ":");
            int score = scanner.nextInt();
            scores.add(score);
        }

        double averageScore = calculateAverage(scores);

        int medianScore = calculateMedian(scores);

        int aboveAverageCount = 0;
        int atAverageCount = 0;
        int belowAverageCount = 0;

        for (int score : scores) {
            if (score > averageScore) {
                aboveAverageCount++;
            } else if (score == averageScore) {
                atAverageCount++;
            } else {
                belowAverageCount++;
            }
        }

        // Display results
        System.out.println("\nTest Score Analysis:");
        System.out.println("Number of students above average: " + aboveAverageCount + ", Median Score: " + medianScore);
        System.out.println("Number of students at average: " + atAverageCount + ", Median Score: " + medianScore);
        System.out.println("Number of students below average: " + belowAverageCount + ", Median Score: " + medianScore);

        scanner.close();
    }

    public static double calculateAverage(List<Integer> scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }

    public static int calculateMedian(List<Integer> scores) {
        Collections.sort(scores);
        int size = scores.size();
        if (size % 2 == 0) {
            int mid1 = size / 2 - 1;
            int mid2 = size / 2;
            return (scores.get(mid1) + scores.get(mid2)) / 2;
        } else {
            // Odd number of elements, middle element
            return scores.get(size / 2);
        }
    }
}
                                     