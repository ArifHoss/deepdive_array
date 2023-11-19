package org.arif.easy;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
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

    public static int maximumWealth1(int[][] accounts) {
        int[] sumOfAccount = new int[accounts.length];

        int maxWealth = 0;
        int sum;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            sumOfAccount[i] = sum;
        }

        for (int i = 0; i < sumOfAccount.length - 1; i++) {
            if (sumOfAccount[i] >= sumOfAccount[i + 1]) {
                maxWealth = sumOfAccount[i];
            }
        }
        return maxWealth;
    }
}
