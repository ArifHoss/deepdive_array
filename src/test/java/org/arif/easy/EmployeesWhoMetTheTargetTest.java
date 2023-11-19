package org.arif.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesWhoMetTheTargetTest {

    @Test
    void numberOfEmployeesWhoMeetTarget() {
        int[] hours = {0, 1, 2, 3, 4};
        assertEquals(3, EmployeesWhoMetTheTarget.numberOfEmployeesWhoMeetTarget(hours, 2));
    }
}