import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AboutGUITest {
    private AboutGUI aboutG;
    @BeforeEach
    void setUp() {
        aboutG = new AboutGUI();
    }

    @Test
    void testNonNull(){
        assertNotNull(aboutG);
    }
}