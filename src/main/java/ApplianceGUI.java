import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ApplianceGUI extends GridTemplateGUI{

    private final String prevPath;
    private final String path;

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
                // TODO: Test this
                String filePath = path + fileName.getText();
                File f = new File(filePath + ".docx");
                int i = 0;
                while (f.exists()) {
                    f = new File(filePath + "(" + ++i + ").docx");
                }
                try {
                    f.createNewFile();
                } catch (IOException ex) {
                }
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