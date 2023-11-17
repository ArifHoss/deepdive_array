package org.arif.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayShuffleTest {

    @Test
    void shuffle() {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] expected = {2,3, 5, 4, 1,7};
        assertArrayEquals(expected, ArrayShuffle.shuffle(nums, 3));
    }
}