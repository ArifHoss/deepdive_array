

# Intuition
To determine the richest customer, we need to calculate the total wealth for each customer and identify the maximum value among them. Wealth is the sum of money in all the customer's bank accounts.

# Approach
Iterate over each customer and calculate the sum of their bank accounts. While doing this, track the maximum wealth seen so far. This can be done in a single pass through the matrix `accounts`, where each row represents a customer and each column represents different bank accounts.

# Complexity
- **Time complexity:** The time complexity is $$O(m \times n)$$, where \( m \) is the number of customers and \( n \) is the number of banks. This is because we iterate over each account of each customer once.
- **Space complexity:** The space complexity is $$O(1)$$ as we are only using a fixed amount of extra space (for `maxWealth` and `sumOfAccount`).

# Code
```java
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sumOfAccount = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sumOfAccount += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, sumOfAccount);
        }
        return maxWealth;
    }
}
```