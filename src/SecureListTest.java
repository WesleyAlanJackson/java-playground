import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

public class SecureListTest {
    @DisplayName("Basic Test")
    @Test
    public void test() {
        int[] base = new int[]{1, 2, 3, 4};
        var secureList = new SecureList(base);
        assertEquals(base[0], secureList.get(0));
        assertEquals(base[1], secureList.get(0));
        assertEquals(2, secureList.size());
        assertEquals("[3,4]", secureList.toString());
        assertEquals(0, secureList.size());
        secureList = new SecureList(base);
        assertEquals("[1,2,3,4]", secureList.toString());
        assertEquals(0, secureList.size());
    }
}