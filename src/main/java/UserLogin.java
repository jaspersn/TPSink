import javax.swing.*;

public class UserLogin {
    private static final String WINDOW_NAME = "Login";
    private static String USER_NAME = "";
    private static String USER_PASSWORD = "";

    public static String getUserPassword() {
        return USER_PASSWORD;
    }

    public static void setUserPassword(String userPassword) {
        USER_PASSWORD = userPassword;
    }

    public static String getUserName() {
        return USER_NAME;
    }

    public static void setUserName(String userName) {
        USER_NAME = userName;
    }

    public static String getWindowName() {
        return WINDOW_NAME;
    }

    public static void yourMethod(JLabel success, String name, String password) {
        //test println
        System.out.println(getUserName() + ", " + getUserPassword());
        // TODO: Make not hard-coded
        if (name.equals(USER_NAME) &&
                password.equals(USER_PASSWORD)) {
            success.setText("Login successful");
        }
    }
}
