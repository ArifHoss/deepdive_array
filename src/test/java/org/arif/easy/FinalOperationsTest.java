package org.arif.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalOperationsTest {

    @Test
    void finalValueAfterOperations() {
        String[] operations = {"--X","X++","X++"};
        assertEquals(1, FinalOperations.finalValueAfterOperations(operations));
        String[] operations2 = {"++X","++X","X++"};
        assertEquals(3,FinalOperations.finalValueAfterOperations(operations2));
        String[] operations3 = {"X++","++X","--X","X--"};
        assertEquals(0,FinalOperations.finalValueAfterOperations(operations3));

    }
}