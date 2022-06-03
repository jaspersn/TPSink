import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  @author Phuoc Le
 *  Date 5/31/22
 *
 * This class is made to test out RoomGUI class.
 */
class RoomGUITest {

    private RoomGUI roomG;

    /**
     * Set up before we test all methods
     */
    @BeforeEach
    void setUp() {
        roomG = new RoomGUI("Le\\Kitchen");
    }

    /**
     * testNonNull is to check if the initiation of object is successful or not.
     */
    @Test
    void testNonNull(){
        assertNotNull(roomG);
    }

    /**
     * testPreviousPath is to check if the previous path is saved correctly or not.
     */
    @Test
    void testPreviousPath(){
        assertEquals("Le", roomG.getPrevPath());
    }

    /**
     * testPath is to check if the path is saved correctly or not.
     */
    @Test
    void testPath(){
        assertEquals("User\\Le\\Kitchen\\", roomG.getPath()); // the path is used to call is different from path is saved
    }

    /**
     * testRoomGUITile is to check if title is set correctly or not.
     */
    @Test
    void testRoomGUITile(){
        assertEquals("Kitchen", roomG.getTitle());
    }


}