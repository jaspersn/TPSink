import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame implements ActionListener  {

    /**
     * Width of GUI window, based on {@link Main#PATH_TO_LOGO} dimensions.
     */
    private static final int WIDTH = 684;
    /**
     * Height of GUI window, based on {@link Main#PATH_TO_LOGO} dimensions.
     */
    private static final int HEIGHT = 729;

    private JPanel panel = new JPanel(new BorderLayout()) {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(new ImageIcon(Main.PATH_TO_LOGO).getImage(), 0, 0, null);
        }
    };

    public MainGUI() {
        // Init buttonPanel that holds Main buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setBackground(new Color(0,0,0,0));

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
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new AboutGUI();
    }
}
