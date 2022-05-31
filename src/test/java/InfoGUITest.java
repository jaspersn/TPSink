import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  @author Phuoc Le
 *  Date 5/31/22
 *
 * This class is made to test out MainGUI class.
 */
class InfoGUITest {
    private infoGUI infoG;

    /**
     * Set up before we test all methods
     */
    @BeforeEach
    void setUp() {
        infoG = new infoGUI();
    }

    /**
     * testNonNull is to check if the initiation of object is successful or not.
     */
    @Test
    void testNonNull(){
        assertNotNull(infoG);
    }
}