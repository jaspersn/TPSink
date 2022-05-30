import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 * A class containing basic functionality for managing {@link Appliance} objects in a {@link Appliance}.
 *  @author Jasper Newkirk
 *  @version 1.0.0
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
        System.out.println(prevPath);
    }

    @Override
    protected ActionListener getBackButtonActionListener() {
        return e -> {
            dispose();
            new RoomGUI(prevPath); // is going back to user
        };
    }

    @Override
    protected ActionListener getButtonActionListener(String path) {
        return e -> {
            //TODO: MOVE THIS SOMEWHERE ELSE
            File f = new File("User\\" + path);
            System.out.println(path);
            Desktop desktop = Desktop.getDesktop();
            if(f.exists()) {
                try {
                    desktop.open(f);
                } catch (IOException ex) {
                }
            }
        };
    }

    @Override
    protected ActionListener getAddButtonActionListener() {
        return e -> {
            JDialog newFileDialog = new JDialog(this, "Create Note:");
            newFileDialog.setLayout( new FlowLayout() );
            newFileDialog.add( new JLabel ("Create a New Note:"));
            JTextField fileName = new JTextField("", 20);
            newFileDialog.add(fileName);
            JButton okButton = new JButton ("Save");
            okButton.addActionListener(l -> {
                new Note(fileName.getText(), path);
                newFileDialog.dispose();
                dispose();
                new ApplianceGUI(path.substring(path.indexOf("\\") + 1).substring(0, path.substring(path.indexOf("\\") + 1).length() - 1));
            });
            newFileDialog.add(okButton);
            newFileDialog.setSize(400,200);
            newFileDialog.setVisible(true);
            add(newFileDialog);
        };
    }
}