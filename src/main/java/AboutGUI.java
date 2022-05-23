import javax.swing.*;
import java.awt.*;

public class AboutGUI extends JFrame {

    private final JPanel panel = new JPanel(new BorderLayout());


    public AboutGUI() {
        panel.setBorder(BorderFactory.createEmptyBorder(20,30,10,30));
        panel.setLayout(new GridLayout(0, 1));

        // add group headings and names
        JPanel groupPanel = new JPanel();

        groupPanel.setLayout(new BoxLayout(groupPanel, BoxLayout.Y_AXIS));
        for(String heading : About.HEADINGS) {
            groupPanel.add(new JLabel(heading));
        }
        for(String name : About.MEMBERS) {
            groupPanel.add(new JLabel("    - " + name));
        }
        panel.add(groupPanel, BorderLayout.NORTH);

        // add version number
        panel.add(new JLabel("Version: " + About.VERSION));
        // frame related stuff
        add(panel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(About.WINDOW_NAME);
        pack();
        setVisible(true);
        setResizable(false);
    }
}
