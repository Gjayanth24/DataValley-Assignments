/*
Write a Java program that accepts a list of book reviews and
returns the number of books reviewed within specified rating
ranges (e.g., 1-5 stars, 6-10 stars), and the count of books with
positive, neutral, and negative reviews.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookReviewAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> bookCountByRatingRange = new HashMap<>();
        Map<String, Integer> reviewCountBySentiment = new HashMap<>();

        // Accept book reviews from the user
        System.out.print("Enter the number of book reviews: ");
        int numReviews = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < numReviews; i++) {
            System.out.println(
                    "Enter book name, rating (out of 10), and review sentiment (positive/neutral/negative) for review "
                            + (i + 1) + ":");
            String bookName = scanner.next();
            int rating = scanner.nextInt();
            String sentiment = scanner.next();

            // Update book count by rating range
            String ratingRange = getRatingRange(rating);
            bookCountByRatingRange.put(ratingRange, bookCountByRatingRange.getOrDefault(ratingRange, 0) + 1);

            // Update review count by sentiment
            reviewCountBySentiment.put(sentiment, reviewCountBySentiment.getOrDefault(sentiment, 0) + 1);
        }

        // Display results
        System.out.println("\nBook Review Analysis:");
        for (Map.Entry<String, Integer> entry : bookCountByRatingRange.entrySet()) {
            String ratingRange = entry.getKey();
            int bookCount = entry.getValue();
            System.out.println("Books in rating range " + ratingRange + ": " + bookCount);
        }

        System.out.println("\nReview Sentiment Analysis:");
        for (Map.Entry<String, Integer> entry : reviewCountBySentiment.entrySet()) {
            String sentiment = entry.getKey();
            int reviewCount = entry.getValue();
            System.out.println("Reviews with sentiment " + sentiment + ": " + reviewCount);
        }

        scanner.close();
    }

    public static String getRatingRange(int rating) {
        if (rating >= 1 && rating <= 5) {
            return "1-5 stars";
        } else if (rating >= 6 && rating <= 10) {
            return "6-10 stars";
        } else {
            return "Invalid rating";
        }
    }
}
