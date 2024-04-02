/*
Write a Java program that accepts a list of movie ratings and
returns the number of movies rated in various categories 
(e.g.,PG, PG-13, R, etc.), and the average rating for each category.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieRatingAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> movieCountByCategory = new HashMap<>();
        Map<String, Double> totalRatingByCategory = new HashMap<>();

        System.out.print("Enter the number of movies: ");
        int numMovies = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numMovies; i++) {
            System.out.println("Enter movie name and rating category (separated by space) for movie " + (i + 1) + ":");
            String movieName = scanner.next();
            String ratingCategory = scanner.next();
            double rating = scanner.nextDouble();

            movieCountByCategory.put(ratingCategory, movieCountByCategory.getOrDefault(ratingCategory, 0) + 1);

            totalRatingByCategory.put(ratingCategory, totalRatingByCategory.getOrDefault(ratingCategory, 0.0) + rating);
        }

        Map<String, Double> averageRatingByCategory = new HashMap<>();
        for (Map.Entry<String, Double> entry : totalRatingByCategory.entrySet()) {
            String category = entry.getKey();
            double totalRating = entry.getValue();
            int movieCount = movieCountByCategory.get(category);
            double averageRating = totalRating / movieCount;
            averageRatingByCategory.put(category, averageRating);
        }

        // Display results
        System.out.println("\nMovie Rating Analysis:");
        for (Map.Entry<String, Integer> entry : movieCountByCategory.entrySet()) {
            String category = entry.getKey();
            int movieCount = entry.getValue();
            double averageRating = averageRatingByCategory.get(category);
            System.out.println("Category: " + category + ", Number of movies: " + movieCount + ", Average Rating: "
                    + averageRating);
        }

        scanner.close();
    }
}
