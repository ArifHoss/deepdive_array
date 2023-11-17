package org.arif.easy;

public class ArrayShuffle {
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffleNums = new int[nums.length];
        for (int i = 0; i < n; i++) {
            shuffleNums[2 * i] = nums[i];
            shuffleNums[2 * i + 1] = nums[n + i];
        }
        return shuffleNums;
    }
}
