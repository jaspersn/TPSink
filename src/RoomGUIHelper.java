import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class RoomGUIHelper extends JFrame implements ActionListener {

    JButton button;
    JButton backButton;
    JTextField textField;

    String prevPath;
    String currentPath;

    // Im considering to pass in the Current RoomGUI, so that I can dispose the old RoomGUI
    // and construct a new RoomGUI when a file is added.
    RoomGUIHelper(String prevPathGiven, String currentPathGiven){ // change "this" to Jframe pass in this argument
        this.prevPath = prevPathGiven;
        this.currentPath = currentPathGiven;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Enter");
        backButton = new JButton("Go Back");
        button.addActionListener(this);
        backButton.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(350,100));
        textField.setFont(new Font("Nano",Font.BOLD,35));
        textField.setText("Room's name here");


        this.add(button);
        this.add(backButton);
        this.add(textField);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
 //       System.out.println(prevPath);
        if(e.getSource()==button) {

 //           System.out.println(prevPath+textField.getText());
            File file = new File(prevPath+textField.getText());
            boolean bool = file.mkdir();
            if (!bool) {
                this.dispose();
  //              System.out.println("folder exists");


                JOptionPane.showMessageDialog(null, "Folder is already exits! please enter a different name");   // add some notification to let user know class already exists

                RoomGUIHelper newFrame = new RoomGUIHelper(prevPath,currentPath); // call it jtext area again.
            } else {

//                System.out.println("folder do not exist");

                //***** then afterward we go back to room gui with new added room by uncommenting next 2 lines
                this.dispose();
                new RoomGUI(currentPath); // when we call ROOMGUI, new button will be added based on newly added diff folder

            }


        } else if(e.getSource()== backButton) {
            dispose();
            new RoomGUI(currentPath);
        }

    }
}
