package org.arif.easy;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[i] == "+nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[nums[i]] == "+ nums[nums[i]]);

        }

        int[] ints = buildArray(nums);
        System.out.println(Arrays.toString(ints));

    }
    public static int[] buildArray(int[] nums) {
        if (nums.length == 0) return new int[]{};
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
