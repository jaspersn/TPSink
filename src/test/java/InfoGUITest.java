import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfoGUITest {
    private infoGUI infoG;
    @BeforeEach
    void setUp() {
        infoG = new infoGUI();
    }

    @Test
    void testNonNull(){
        assertNotNull(infoG);
    }
}