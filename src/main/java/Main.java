import java.io.File;

/**
 * @author Xavier Hines
 * Date 5/12/22
 */
public class Main {

    /**
     * Path for main window home Image
     */
    private static final String PATH_TO_LOGO = "Assets/TPSink.png";

    /**
     * main method, runs program
     * @param args
     */
    public static void main(String[] args) throws Exception {
        //Room r = new Room();
        //r.yamlRead();
        //User us = new User();
        //us.yamlRead();
        //us.yamlWrite();
        //new MainGUI();
        //new RoomGUI("Le");
        new UserGUI("Le");
//        File le = new File("User/Le");
//        System.out.print(le.isDirectory());
    }

    /**
     * returns main image path
     * @return main image path
     */
    public static String getPathToLogo() {
        return PATH_TO_LOGO;
    }
}

