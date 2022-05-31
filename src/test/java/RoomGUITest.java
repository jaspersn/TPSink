import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomGUITest {

    private RoomGUI roomG;
    @BeforeEach
    void setUp() {
        roomG = new RoomGUI("Le\\Kitchen");
    }

    @Test
    void testNonNull(){
        assertNotNull(roomG);
    }

    @Test
    void testPreviousPath(){
        assertEquals("Le", roomG.getPrevPath());
    }

    @Test
    void testPath(){
        assertEquals("User\\Le\\Kitchen\\", roomG.getPath()); // the path is used to call is different from path is saved
    }

    @Test
    void testRoomGUITile(){
        assertEquals("Kitchen", roomG.getTitle());
    }


}