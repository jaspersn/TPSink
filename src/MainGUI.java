import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame implements ActionListener  {

    private JPanel panel = new JPanel();

    public MainGUI() {
        JButton button = new JButton(About.WINDOW_NAME);
        JButton LoginButton = new JButton(UserLogin.getWindowName());
        //action listener lambda implementation
        button.addActionListener(e -> new AboutGUI());
        LoginButton.addActionListener(e -> new UserLoginGUI());

        buttonPanel.add(button);
        buttonPanel.add(LoginButton);

        panel.add(buttonPanel, BorderLayout.LINE_END);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(About.GROUP_NAME);
        add(panel);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new AboutGUI();
    }
}
