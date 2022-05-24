import javax.swing.*;
import java.awt.*;

/**
 * @author Xavier Hines
 * Date 5/9/22
 */
public class LoginGUI extends JFrame {

    /**
     * Panel containing all the user needs to login
     */
    private final JPanel panel = new JPanel();


    /**
     * Creates two text boxes labeled 'User' and 'Password' that will collect that
     * information from the user. One button labeled Login that checks that info
     * against stored user login info.
     */
    public LoginGUI() {
        setSize(350,200);
        setTitle(Login.getWindowName());


        panel.setLayout(null);

        //user Label
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        //User Textbox
        JTextField userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        //Password Label
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        //Password Text
        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        //success label
        JLabel success = new JLabel("");
        success.setBounds(120,80,300,25);
        panel.add(success);

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10,80,80,25);
        // Action for password checking
        loginButton.addActionListener(e ->
                Login.checkUserAndPassword(success, userText.getText(), String.valueOf(passwordText.getPassword()))
        );
        panel.add(loginButton);

        // Import Settings Button
        JButton importUserButton = new JButton("Import User");
        importUserButton.setBounds(10,120,130,25);
        importUserButton.addActionListener(e ->
                System.out.println("This is Xavier's Job I am simply the messenger -Jasper")
        );
        panel.add(importUserButton);

        JButton exportUserButton = new JButton("Export User");
        exportUserButton.setBounds(150,120,130,25);
        exportUserButton.addActionListener(e ->
                System.out.println("This is Xavier's Job I am simply the messenger -Jasper")
        );
        panel.add(exportUserButton);

        add(panel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
