package codewars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// TODO: Replace examples and use TDD by writing your own tests

public class PascalDiagonalsTest {
    @DisplayName("Pascal Diagonals Test")
    @Test
    public void test() {
        long[] base = new long[]{1, 2, 1};
        assertArrayEquals(base, PascalDiagonals.generateDiagonal(2, 10));

        base = new long[]{1, 5, 10, 10, 5, 1};
        assertArrayEquals(base, PascalDiagonals.generateDiagonal(5, 10));
    }
}