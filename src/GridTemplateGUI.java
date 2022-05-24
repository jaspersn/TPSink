import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * An abstract class containing basic functionality for managing {@link Room} and {@link User} objects.
 * @author Jasper Newkirk
 * @version 1.0.0
 */
public abstract class GridTemplateGUI extends JFrame {
    /**
     * The default width of the window.
     */
    private static final int WIDTH = 1280;
    /**
     * The default height of the window.
     */
    private static final int HEIGHT = 720;
    /**
     * The main {@link JPanel} for display in the window.
     */
    private final JPanel panel = new JPanel();
    private final JPanel buttonPanel = new JPanel();
    private final JPanel backButtonPanel = new JPanel();

    /**
     * Constructs a new GridTemplateGUI window with a grid of {@link JButton}'s denoting all directories in the current {@code path}.
     * @param path The parent directory.
     * @throws HeadlessException when the environment does not support a keyboard, display, or mouse.
     */
    public GridTemplateGUI(String path) throws HeadlessException {
        setSize(WIDTH, HEIGHT);
        panel.setLayout(new BorderLayout());

        JScrollPane scrollPane = new JScrollPane(initButtonPanel(path)); // makes buttons scrollable
        panel.add(scrollPane, BorderLayout.CENTER);


        JButton backButton = new JButton("← Go Back");
        backButton.addActionListener(getBackButtonActionListener());
        backButtonPanel.add(backButton);

        panel.add(backButtonPanel, BorderLayout.NORTH);

        add(panel);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    /**
     * Creates and returns the child paths and files in the given {@code dir} directory as a {@link File} array.
     * @param dir the directory to be loaded from.
     * @return the child paths and files in the given {@code dir} directory as a {@link File} array or
     * {@code null} if the directory is empty.
     */
    private File[] loadDir(String dir) {
        File f = new File(dir);
        if (f.exists() && f.isDirectory()) return f.listFiles();
        return null;
    }

    /**
     * Initializes the button panel consisting of all directories and files present in {@code path}.
     * Empty directories will return only an add button.
     * @param path the directory to which the button's will populate.
     * @return a button panel consisting of all directories and files present in {@code path}.
     */
    private JPanel initButtonPanel(String path) {
        JPanel buttonPanel = new JPanel(new GridLayout(0, 2)); // infinite rows
        File[] labels = loadDir(path);
        if (labels != null) {
            for (File f : labels) {
                JButton b = new JButton(f.getName());
                b.addActionListener(getButtonActionListener(f.getPath().substring(f.getPath().indexOf("\\") + 1)));
                b.setPreferredSize(new Dimension(0, HEIGHT / 4));
                buttonPanel.add(b);
            }
        }
        JButton addButton = new JButton("+ ADD");
        addButton.setBackground(Color.GREEN.darker()); // temporary for visualization
        addButton.addActionListener(getAddButtonActionListener());
        buttonPanel.add(addButton);
        return buttonPanel;
    }

    /**
     * Returns a functional {@link JButton} within a {@link JPanel} used to go back to the previous screen.
     * @return a functional {@link JButton} within a {@link JPanel} used to go back to the previous screen.
     */
    protected abstract ActionListener getBackButtonActionListener();

    /**
     * Returns the {@link ActionListener} to be present in each directory-related button in this window.
     * @param path the directory associated with the {@link JButton} button.
     * @return the {@link ActionListener} to be present in each directory-related button in this window.
     */
    protected abstract ActionListener getButtonActionListener(String path);

    protected abstract ActionListener getAddButtonActionListener();

}