package org.arif.easy;

import java.util.Collections;
import java.util.List;

public class CountPairs {
    public static int countPairs(List<Integer> nums, int target) {
        int counter = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int countParisTwoPointerMethod(List<Integer> nums, int target) {
        Collections.sort(nums);
        int counter = 0;
        int start = 0;
        int end = nums.size() - 1;
        while (start < end) {
            int sum = nums.get(start) + nums.get(end);
            if (sum < target) {
                counter += (end - start);
                start++;
            } else {
                end--;
            }
        }
        return counter;
    }

    public static int countPairs1(int[] nums, int target) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] < target) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
