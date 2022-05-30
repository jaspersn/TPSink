import javax.swing.*;

/**
 * @author Xavier Hines
 * Date 5/9/22
 */
public class Login {
    /**
     * name of the window
     */
    private static final String WINDOW_NAME = "Login";
    /**
     * Where the username will be stored?
     */
    private static String USER_NAME = "";
    /**
     * where the user password will be stored?
     */
    private static String USER_PASSWORD = "";

    /**
     * @return user password
     */
    public static String getUserPassword() {
        return USER_PASSWORD;
    }

    //TODO User name and password Constructor

    /**
     * @param userPassword password to set
     */
    public static void setUserPassword(String userPassword) {
        USER_PASSWORD = userPassword;
    }

    /**
     * @return username
     */
    public static String getUserName() {
        return USER_NAME;
    }

    /**
     * @param userName sets username
     */
    public static void setUserName(String userName) {
        USER_NAME = userName;
    }

    /**
     * @return window name
     */
    public static String getWindowName() {
        return WINDOW_NAME;
    }

    /**
     * Action that will accept a string name and password when the user
     * attempts to login and checks them against the saved username and password.
     * @param success Label to indicate if correct or not
     * @param name String representing username
     * @param password String representing password
     */
    public static void checkUserAndPassword(JLabel success, String name, String password) {
        // TODO: Make not hard-coded
        if (name.equals(USER_NAME) &&
                password.equals(USER_PASSWORD)) {
            success.setText("Login successful");
        } else {
            success.setText("Wrong User Name Or Pass");
        }
    }
}
