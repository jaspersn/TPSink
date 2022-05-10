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
    protected static final String VERSION = "0.1.0";
    /**
     * The group name.
     */
    protected static final String GROUP_NAME = "TPSink";
    /**
     * An array of about info headings
     */
    protected static final String[] HEADINGS = {"This app is registered to: " + UserLogin.getUserName(), "This app is provided by: " + GROUP_NAME};
    /**
     * An array of group member names.
     */
    protected static final String[] MEMBERS = {"Xavier Hines", "Jasper Newkirk"};

    protected static final String WINDOW_NAME = "About";

}
