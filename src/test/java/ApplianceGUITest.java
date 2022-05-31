import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ApplianceGUITest {
    private ApplianceGUI appG;
    @BeforeEach
    void setUp() {
        appG = new ApplianceGUI("Le\\Kitchen\\spoon");
    }

    @Test
    void testNonNull(){
        assertNotNull(appG);
    }

    @Test
    void testPreviousPath(){
        assertEquals("Le\\Kitchen", appG.getPrevPath());
    }

    @Test
    void testPath(){
        assertEquals("User\\Le\\Kitchen\\spoon\\", appG.getPath()); // the path is used to call is different from path is saved
    }

}