import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    Main m;

    @BeforeEach
    void SetUp() {
        m = new Main();
    }

    @Test
    void result() {
        assertEquals("You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out it front of you!He opened  his jaws and ...\n" +
                "Goobles you down in one bite!\n", m.result(1));
    }
    @Test
    void result2() {
        assertEquals("Take my treasure", m.result(2));
    }
}