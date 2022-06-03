import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  @author Phuoc Le
 *  Date 5/31/22
 *
 * This class is made to test out UserGUI class.
 */
class UserGUITest {
    private UserGUI userG;

    /**
     * Set up before we test all methods
     */
    @BeforeEach
    void setUp() {
        userG = new UserGUI("Le");
    }

    /**
     * testNonNull is to check if the initiation of object is successful or not.
     */
    @Test
    void testNonNull(){
        assertNotNull(userG);
    }

    /**
     * testUserGUI is to check if the path is saved correctly or not.
     */
    @Test
    void testUserGUI(){
        assertEquals("User\\Le\\", userG.getPath());
    }


    /**
     * testNewUserGUI is to check if new user is added correctly.
     */
    @Test
    void testNewUserGUI(){
        UserGUI newUser = new UserGUI ("JohnWick");
        assertNotNull(newUser);
        assertEquals("User\\JohnWick\\", newUser.getPath());
    }

    /**
     * testUserGUITile is to check if title is set correctly or not.
     */
    @Test
    void testUserGUITile(){
        assertEquals("Le", userG.getTitle());
    }
}