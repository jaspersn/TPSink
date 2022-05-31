import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserGUITest {
    private UserGUI userG;
    @BeforeEach
    void setUp() {
        userG = new UserGUI("Le");
    }

    @Test
    void testNonNull(){
        assertNotNull(userG);
    }

    @Test
    void testUserGUI(){
        assertEquals("User\\Le\\", userG.getPath());
    }

    @Test
    void testNewUserGUI(){
        UserGUI newUser = new UserGUI ("JohnWick");
        assertNotNull(newUser);
        assertEquals("User\\JohnWick\\", newUser.getPath());
    }
    @Test
    void testUserGUITile(){
        assertEquals("Le", userG.getTitle());
    }
}