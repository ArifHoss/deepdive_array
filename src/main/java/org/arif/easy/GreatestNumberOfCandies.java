package org.arif.easy;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        List<Boolean> booleans = kidsWithCandies(candies, 3);
        booleans.forEach(System.out::println);
        int[] candies1 = {4, 2, 1, 1, 2};
        List<Boolean> booleans1 = kidsWithCandies(candies1, 1);
        booleans1.forEach(System.out::println);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int greatest = 0;
        for (int candy : candies) {
            greatest = Math.max(greatest, candy);
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= greatest);
        }

        return result;

    }
}
