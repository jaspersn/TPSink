import javax.swing.*;

/**
 * @author Xavier Hines
 * Date 5/9/22
 */
public class UserLoginGUI extends JFrame {

    /**
     * Panel containing all the user needs to login
     */
    private final JPanel panel = new JPanel();


    /**
     * Creates two text boxes labeled 'User' and 'Password' that will collect that
     * information from the user. One button labeled Login that checks that info
     * against stored user login info.
     */
    public UserLoginGUI() {
        setSize(350,200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Login");
        add(panel);

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
        success.setBounds(10,110,300,25);
        panel.add(success);

        //Login Button
        JButton button = new JButton("Login");
        button.setBounds(10,80,80,25);
        //Action for password checking
        button.addActionListener(e ->
                UserLogin.checkUserAndPassword(success, userText.getText(), passwordText.getText())
        );
        panel.add(button);

        setVisible(true);
    }
}