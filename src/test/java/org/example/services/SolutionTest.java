package org.example.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void testExactMatch() {
        assertEquals(1, solution.numDistinct("abc", "abc"));
    }

    @Test
    void testMultiplePaths() {
        assertEquals(3, solution.numDistinct("rabbbit", "rabbit"));
    }

    @Test
    void testMultipleOccurrences() {
        assertEquals(5, solution.numDistinct("babgbag", "bag"));
    }

    @Test
    void testEmptyTarget() {
        assertEquals(1, solution.numDistinct("abc", ""));
    }

    @Test
    void testEmptySource() {
        assertEquals(0, solution.numDistinct("", "a"));
    }

    @Test
    void testTargetLongerThanSource() {
        assertEquals(0, solution.numDistinct("a", "abc"));
    }

    @Test
    void testNoPossibleMatch() {
        assertEquals(0, solution.numDistinct("abc", "def"));
    }
}