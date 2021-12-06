import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    Main m;

    @BeforeEach
    void setUp() {
        m = new Main();

    }

    @Test
    void guessLow() {
        assertEquals(false, m.guess(10, "Alina", 3, 4), "Low guess returns true");
    }
    @Test
    void guessHigh() {
        assertEquals(false, m.guess(10, "Alina", 3, 14), "High guess returns true");
    }
    @Test
    void guessRight() {
        assertEquals(true, m.guess(10, "Alina", 3, 10), "Correct guess returns false");
    }
}