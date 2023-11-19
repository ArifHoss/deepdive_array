package org.arif.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealthTest {

    @Test
    void maximumWealth() {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        assertEquals(6, RichestCustomerWealth.maximumWealth(accounts));
        int[][] accounts1 = {{1, 2, 3}, {3, 2, 1},{2,3,4}};
        assertEquals(9,RichestCustomerWealth.maximumWealth(accounts1));

    }
}