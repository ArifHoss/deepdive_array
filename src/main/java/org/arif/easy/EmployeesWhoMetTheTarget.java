package org.arif.easy;

public class EmployeesWhoMetTheTarget {
    public static int numberOfEmployeesWhoMeetTarget(int[] hours, int target) {
        int counter = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                counter++;
            }
        }
        return counter;
    }
}
