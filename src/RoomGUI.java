import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RoomGUI extends GridTemplateGUI{

    private final String prevPath;
    private final String currentPath;

    public RoomGUI(String path) {
        super("User\\" + path + "\\");
        setTitle(path.substring(path.lastIndexOf("\\") + 1)); // Override title back to simple name
        this.prevPath = path.substring(0, path.lastIndexOf("\\"));
        this.currentPath = path;
        System.out.println(prevPath);
    }

    @Override
    protected ActionListener getBackButtonActionListener() {
        return e -> {
            dispose();
            new UserGUI(prevPath); // is going back to user
        };
    }

    @Override
    protected ActionListener getButtonActionListener(String path) {
        return e -> {
            dispose();
            new ApplianceGUI(path);
        };
    }

    @Override
    protected ActionListener getAddButtonActionListener() {
        return e-> {

            new RoomGUIHelper(prevPath, currentPath);

        };
    }
}