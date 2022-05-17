package codewars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// TODO: Replace examples and use TDD by writing your own tests

public class PascalDiagonalsTest {
    @DisplayName("Pascal Diagonals Test")
    @Test
    public void test() {
        long[] base = new long[]{1, 3, 6, 10, 15};
        assertArrayEquals(base, PascalDiagonals.generateDiagonal(2, 5));

    }
}