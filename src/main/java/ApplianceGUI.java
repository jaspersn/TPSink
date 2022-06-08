import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 * A class containing basic functionality for managing {@link Appliance} objects in a {@link Appliance}.
 *  @author Jasper Newkirk
 * @author Phuoc Le
 */
public class ApplianceGUI extends GridTemplateGUI{

    /**
     * The path the room containing this {@link Appliance}.
     */
    private final String prevPath;
    /**
     * The current path to this {@link Appliance}.
     */
    private final String path;

    /**
     * Constructs a new {@link ApplianceGUI} window with a grid of {@link JButton}'s denoting all directories in the current {@code path}.
     * @param path The parent directory.
     * @throws HeadlessException when the environment does not support a keyboard, display, or mouse.
     */
    public ApplianceGUI(String path) {
        super("User\\" + path + "\\");
        this.path = "User\\" + path + "\\";
        setTitle(path.substring(path.lastIndexOf("\\") + 1)); // Override title back to simple name
        this.prevPath = path.substring(0, path.lastIndexOf("\\"));
    }

    /**
     * Refreshes and updates the current {@link ApplianceGUI}.
     * @author Jasper Newkirk
     */
    @Override
    protected void refresh() {
        dispose();
        new ApplianceGUI(path.substring(path.indexOf("\\") + 1).substring(0, path.substring(path.indexOf("\\") + 1).length() - 1));
    }

    /**
     * Returns an {@link ActionListener} used to go back to the previous screen.
     * @author Jasper Newkirk
     * @return an {@link ActionListener} used to go back to the previous screen.
     */
    @Override
    protected ActionListener getBackButtonActionListener() {
        return e -> {
            dispose();
            new RoomGUI(prevPath); // is going back to user
        };
    }

    /**
     * Returns the {@link ActionListener} to be present in each directory-related button in this {@link ApplianceGUI} window.
     * @author Jasper Newkirk
     * @param path the directory associated with the {@link JButton} button.
     * @return the {@link ActionListener} to be present in each directory-related button in this {@link ApplianceGUI} window.
     */
    @Override
    protected ActionListener getButtonActionListener(String path) {
        return e -> Note.open(path);
    }

    /**
     * Returns the {@link ActionListener} to be executed upon pressing the "Add" button in this {@link ApplianceGUI} window.
     * @author Jasper Newkirk
     * @return the {@link ActionListener} to be executed upon pressing the "Add" button in this {@link ApplianceGUI} window.
     */
    @Override
    protected ActionListener getAddButtonActionListener() {
        return e -> {
            // Creates a series of JLabels and dialog boxes for creating a note
            JDialog newNoteDialog = new JDialog(this, "Create Note:");
            newNoteDialog.setLayout( new FlowLayout() );
            newNoteDialog.add( new JLabel ("Create a New Note:"));
            JTextField fileName = new JTextField("", 20);
            newNoteDialog.add(fileName);
            JButton okButton = new JButton ("Save");

            // save the note
            okButton.addActionListener(l -> {
                new Note(fileName.getText(), path);
                newNoteDialog.dispose();
                refresh();
            });
            newNoteDialog.add(okButton);
            newNoteDialog.setSize(400,200);
            newNoteDialog.setVisible(true);
            try {
                add(newNoteDialog);
            } catch (IllegalArgumentException ignore){}
        };
    }

    /**
     * Returns the previous path relative to the current {@link ApplianceGUI#path}.
     * @author Phuoc Le
     * @return the previous path relative to the current {@link ApplianceGUI#path}.
     */
    public String getPrevPath() {
        return prevPath;
    }

    /**
     * Returns the current directory.
     * @author Phuoc Le
     * @return the current directory.
     */
    public String getPath() {
        return path;
    }
}