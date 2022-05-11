/**
 *  @author Xavier Hines
 *  @author Jasper Newkirk
 *  @author Jeremy Tirador
 *  @author Phuoc Le
 *
 *  This class has all the info about the program itself!
 *  @version 0.1.0
 */
public class About {
    /**
     * The current version number of the program.
     */
    private static final String VERSION = "0.1.0";

    /**
     * returns Version
     * @return Version
     */
    public static String getVersion() {
        return VERSION;
    }

    /**
     * The group name.
     */
    private static final String GROUP_NAME = "TPSink";

    /**
     * @return GROUP_NAME
     */
    public static String getGroupName() {
        return GROUP_NAME;
    }

    /**
     * An array of about info headings
     */
    private static final String[] HEADINGS = {"This app is registered to: " + UserLogin.getUserName(), "This app is provided by: " + GROUP_NAME};

    /**
     * @return HEADINGS
     */
    public static String[] getHeadings() {
        return HEADINGS;
    }

    /**
     * An array of group member names.
     */
    private static final String[] MEMBERS = {"Xavier Hines", "Jasper Newkirk", "Jeremy Tirador", " Phuoc Le"};

    /**
     * @return GET_MEMBERS
     */
    public static String[] getMembers() {
        return MEMBERS;
    }

    /**
     * Stores Windows name
     */
    private static final String WINDOW_NAME = "About";

    /**
     * @return WINDOW_NAME
     */
    public static String getWindowName() {
        return WINDOW_NAME;
    }

}
