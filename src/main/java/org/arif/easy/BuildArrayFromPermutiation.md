## Problem
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).



- Example 1:
* Input: nums = [0,2,1,5,3,4]
* Output: [0,1,2,4,5,3]
- Example 2:

* Input: nums = [5,0,1,2,3,4]
* Output: [4,5,0,1,2,3]
## Intuition

This problem involves creating a new array based on a given zero-based permutation array, `nums`. The new array, `ans`,
is constructed such that each element at index `i` in `ans` is the element at index `nums[i]` in the original
array `nums`.
To solve this problem, iterate over the `nums` array. For each index `i`, find the element at index `nums[i]` in `nums`,
and place that element at index `i` in the new array `ans`.

## Approach

- Initialize an array `ans` of the same length as `nums`.
- Loop through each index `i` in `nums`.
- For each `i`, set `ans[i] = nums[nums[i]]`.
- Return the array `ans`.

## Complexity

- **Time complexity:** $$O(n)$$ - The solution requires iterating through the `nums` array once, where `n` is the length
  of the array.
- **Space complexity:** $$O(n)$$ - A new array `ans` of the same size as `nums` is created.

## Code

```java
class Solution {
    public int[] buildArray(int[] nums) {
        if (nums.length == 0) return new int[]{};
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
```
