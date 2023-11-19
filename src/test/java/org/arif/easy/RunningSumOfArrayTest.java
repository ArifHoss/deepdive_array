package org.arif.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOfArrayTest {

    @Test
    void runningSum() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};

        assertArrayEquals(expected, RunningSumOfArray.runningSum(nums));
    }
}