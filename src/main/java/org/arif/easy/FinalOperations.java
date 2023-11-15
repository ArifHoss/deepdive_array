package org.arif.easy;

public class FinalOperations {

    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                X++;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                X--;
            }
        }
        return X;
    }
}
