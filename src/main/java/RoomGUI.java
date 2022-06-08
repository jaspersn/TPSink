import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * A class containing basic functionality for managing {@link Appliance} objects in a {@link User}.
 *  @author Jasper Newkirk
 *  @author Phuoc Le
 */
public class RoomGUI extends GridTemplateGUI {

    /**
     * The path the room containing this {@link Appliance}.
     */
    private final String prevPath;
    /**
     * The current directory.
     */
    private final String path;

    /**
     * Constructs a new {@link RoomGUI} window with a grid of {@link JButton}'s denoting all directories in the current {@code path}.
     * @author Jasper Newkirk
     * @param path The parent directory.
     * @throws HeadlessException when the environment does not support a keyboard, display, or mouse.
     */
    public RoomGUI(String path) {
        super("User\\" + path + "\\");
        this.path = "User\\" + path + "\\";
        setTitle(path.substring(path.lastIndexOf("\\") + 1)); // Override title back to simple name
        this.prevPath = path.substring(0, path.lastIndexOf("\\"));
    }

    /**
     * Refreshes and updates the current {@link RoomGUI}.
     * @author Jasper Newkirk
     */
    @Override
    protected void refresh() {
        dispose();
        new RoomGUI(path.substring(path.indexOf("\\") + 1).substring(0, path.substring(path.indexOf("\\") + 1).length() - 1));
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
            new UserGUI(prevPath); // is going back to user
        };
    }

    /**
     * Returns the {@link ActionListener} to be present in each directory-related button in this {@link RoomGUI} window.
     * @author Jasper Newkirk
     * @param path the directory associated with the {@link JButton} button.
     * @return the {@link ActionListener} to be present in each directory-related button in this {@link RoomGUI} window.
     */
    @Override
    protected ActionListener getButtonActionListener(String path) {
        return e -> {
            dispose();
            new ApplianceGUI(path);
        };
    }
    /**
     * Returns the {@link ActionListener} to be executed upon pressing the "Add" button in this {@link RoomGUI} window.
     * @author Jasper Newkirk
     * @return the {@link ActionListener} to be executed upon pressing the "Add" button in this {@link RoomGUI} window.
     */
    @Override
    protected ActionListener getAddButtonActionListener() {
        return e -> {
            // Creates a series of JLabels and dialog boxes for creating an appliance
            JDialog newApplianceDialog = new JDialog(this, "Create Appliance:");
            newApplianceDialog.setLayout( new FlowLayout() );
            newApplianceDialog.add( new JLabel ("Create a New Appliance:"));
            JTextField roomName = new JTextField("", 20);
            newApplianceDialog.add(roomName);
            newApplianceDialog.add( new JLabel ("Description:"));
            JTextField description = new JTextField("", 20);
            newApplianceDialog.add(description);
            
            // save the appliance name and description
            JButton okButton = new JButton ("Save");
            okButton.addActionListener(l -> {
                new Appliance(roomName.getText(), path, description.getText());
                newApplianceDialog.dispose();
                refresh();
            });
            
            newApplianceDialog.add(okButton);
            newApplianceDialog.setSize(400,200);
            newApplianceDialog.setVisible(true);
            try {
                add(newApplianceDialog);
            } catch (IllegalArgumentException ignore){}
        };
    }

    /**
     * Returns the previous path relative to the current {@link RoomGUI#path}.
     * @author Phuoc Le
     * @return the previous path relative to the current {@link RoomGUI#path}.
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
