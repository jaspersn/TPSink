/**
 * @author Jasper Newkirk
 * @author Xavier Hines
 * Stores information about the application.
 */
public class About {
    /**
     * Instantiates a new {@link Login} object to access information from the user.
     * @author Xavier Hines
     */
    private static Login L;
    static {
        try {
            L = new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * The current version number of the program.
     */
    private static final String VERSION = "1.5.1";

    /**
     * Returns the version ({@link About#VERSION}) associated with this build of the application.
     * @author Jasper Newkirk
     * @return the version ({@link About#VERSION}) associated with this build of the application.
     */
    public static String getVersion() {
        return VERSION;
    }

    /**
     * The name of the group responsible for this application.
     */
    private static final String GROUP_NAME = "TPSink";

    /**
     * Returns the name of the group responsible for this application ({@link About#GROUP_NAME}).
     * @author Jasper Newkirk
     * @return the name of the group responsible for this application ({@link About#GROUP_NAME}).
     */
    public static String getGroupName() {
        return GROUP_NAME;
    }

    /**
     * An array of information headings.
     */
    private static final String[] HEADINGS = {"This app is registered to: " + L.getUserName() + "This app is provided by: " + GROUP_NAME};

    /**
     * Returns the {@link About#HEADINGS} array to be associated with the {@link AboutGUI} window.
     * @author Jasper Newkirk
     * @return the {@link About#HEADINGS} array to be associated with the {@link AboutGUI} window.
     */
    public static String[] getHeadings() {
        return HEADINGS;
    }

    /**
     * An array of group member names.
     */
    private static final String[] MEMBERS = {"Xavier Hines", "Jasper Newkirk", "Jeremy Tirador", " Phuoc Le"};

    /**
     * Returns the {@link About#MEMBERS} array to be associated with the {@link AboutGUI} window.
     * @author Jasper Newkirk
     * @return the {@link About#MEMBERS} array to be associated with the {@link AboutGUI} window.
     */
    public static String[] getMembers() {
        return MEMBERS;
    }

    /**
     * The name of the Window.
     */
    private static final String WINDOW_NAME = "About";

    /**
     * Returns the intended name ({@link About#WINDOW_NAME}) to be associated with the {@link AboutGUI} window.
     * @author Jasper Newkirk
     * @return the intended name ({@link About#WINDOW_NAME}) to be associated with the {@link AboutGUI} window.
     */
    public static String getWindowName() {
        return WINDOW_NAME;
    }

}
