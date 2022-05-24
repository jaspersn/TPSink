import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class UserGUI extends GridTemplateGUI{
    public UserGUI(String username) {
        super("User\\" + username + "\\");
        setTitle(username); // Override title back to simple name
    }

    @Override
    protected ActionListener getBackButtonActionListener() {
        return e -> {
            dispose();
            new MainGUI();
        };
    }

    @Override
    protected ActionListener getButtonActionListener(String path) {
        return e -> {
            dispose();
            new RoomGUI(path);
        };
    }

    @Override
    protected ActionListener getAddButtonActionListener() {
        //TODO: IMPLEMENT THIS
        return null;
    }
}
