import javax.swing.*;
import java.awt.*;

public class AboutGUI extends JFrame {

    private final JPanel panel = new JPanel(new BorderLayout());


    public AboutGUI() {
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        //TODO establish layout for information
        panel.setLayout(new GridLayout(0, 1));

        // add group names
        panel.add(new JLabel("Authors:"));
        for(String name : About.MEMBERS) {
            panel.add(new JLabel(" - " + name));
        }
        // add version number
        panel.add(new JLabel("Version: " + About.VERSION));
        // frame related stuff
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(About.WINDOW_NAME);
        pack();
        setVisible(true);
    }
}
