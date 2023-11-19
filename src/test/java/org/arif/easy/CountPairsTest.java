package org.arif.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountPairsTest {

    @Test
    void countPairs() {
        assertEquals(3, CountPairs.countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2));
        assertEquals(3, CountPairs.countParisTwoPointerMethod(Arrays.asList(-1, 1, 2, 3, 1), 2));
        assertEquals(10, CountPairs.countPairs(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2));
        assertEquals(10, CountPairs.countParisTwoPointerMethod(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2));

    }
}