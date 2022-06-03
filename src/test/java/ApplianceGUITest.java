import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *  @author Phuoc Le
 *  Date 5/31/22
 *
 * This class is made to test out UserGUI class.
 */
class ApplianceGUITest {
    private ApplianceGUI appG;

    /**
     * Set up before we test all methods
     */
    @BeforeEach
    void setUp() {
        appG = new ApplianceGUI("Le\\Kitchen\\spoon");
    }

    /**
     * testNonNull is to check if the initiation of object is successful or not.
     */
    @Test
    void testNonNull(){
        assertNotNull(appG);
    }

    /**
     * testPreviousPath is to check if the previous path is saved correctly or not.
     */
    @Test
    void testPreviousPath(){
        assertEquals("Le\\Kitchen", appG.getPrevPath());
    }

    /**
     * testPath is to check if the path is saved correctly or not.
     */
    @Test
    void testPath(){
        assertEquals("User\\Le\\Kitchen\\spoon\\", appG.getPath()); // the path is used to call is different from path is saved
    }

    /**
     * testRoomGUITile is to check if title is set correctly or not.
     */
    @Test
    void testRoomGUITile(){
        assertEquals("spoon", appG.getTitle());
    }

}