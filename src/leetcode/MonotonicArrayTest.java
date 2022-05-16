package leetcode;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// TODO: Replace examples and use TDD by writing your own tests

public class MonotonicArrayTest {
    @DisplayName("Basic Test")
    @Test
    public void test() {
        int[] base = new int[]{1, 2, 3, 4};
        var monoArr = new MonotonicArray();
        assertTrue(monoArr.isMonotonic(base));

        base = new int[]{6,5,4,4};
        assertTrue(monoArr.isMonotonic(base));

        base = new int[] {6, 6, 7, 5};
        assertFalse(monoArr.isMonotonic(base));
    }
}