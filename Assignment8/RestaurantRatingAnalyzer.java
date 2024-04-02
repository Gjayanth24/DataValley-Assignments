/*
Write a Java program that accepts a list of restaurant ratings
and returns the number of restaurants rated within specific ranges
(e.g., 1-5, 6-10), and the average rating for each range
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantRatingAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> restaurantCountByRatingRange = new HashMap<>();
        Map<String, Double> totalRatingByRatingRange = new HashMap<>();

        System.out.print("Enter the number of restaurants: ");
        int numRestaurants = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numRestaurants; i++) {
            System.out.println("Enter restaurant name and rating (out of 10) for restaurant " + (i + 1) + ":");
            String restaurantName = scanner.next();
            int rating = scanner.nextInt();

            String ratingRange = getRatingRange(rating);
            restaurantCountByRatingRange.put(ratingRange,
                    restaurantCountByRatingRange.getOrDefault(ratingRange, 0) + 1);

            totalRatingByRatingRange.put(ratingRange, totalRatingByRatingRange.getOrDefault(ratingRange, 0.0) + rating);
        }

        Map<String, Double> averageRatingByRatingRange = new HashMap<>();
        for (Map.Entry<String, Double> entry : totalRatingByRatingRange.entrySet()) {
            String ratingRange = entry.getKey();
            double totalRating = entry.getValue();
            int restaurantCount = restaurantCountByRatingRange.get(ratingRange);
            double averageRating = totalRating / restaurantCount;
            averageRatingByRatingRange.put(ratingRange, averageRating);
        }

        // Display results
        System.out.println("\nRestaurant Rating Analysis:");
        for (Map.Entry<String, Integer> entry : restaurantCountByRatingRange.entrySet()) {
            String ratingRange = entry.getKey();
            int restaurantCount = entry.getValue();
            double averageRating = averageRatingByRatingRange.get(ratingRange);
            System.out.println("Restaurants in rating range " + ratingRange + ": " + restaurantCount
                    + ", Average Rating: " + averageRating);
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
