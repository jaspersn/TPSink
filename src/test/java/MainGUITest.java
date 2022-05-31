import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainGUITest {
    private MainGUI mainG;
    @BeforeEach
    void setUp() {
        mainG = new MainGUI();
    }

    @Test
    void testNonNull(){
        assertNotNull(mainG);
    }
}