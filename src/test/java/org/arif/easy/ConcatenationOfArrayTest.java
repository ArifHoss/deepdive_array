package org.arif.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfArrayTest {

    @Test
    void getConcatenation() {
        int[] nums = {1, 2, 1};
        int[] actual = ConcatenationOfArray.getConcatenation(nums);
        int[] expected = {1, 2, 1, 1, 2, 1};
        assertArrayEquals(actual, expected);
    }
}