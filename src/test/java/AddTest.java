import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    @DisplayName("2 + 3 = 5")
    void add() {
        Add a = new Add();
        assertEquals(5, a.add(2, 3), "2 + 3 should equal 5");
    }
}