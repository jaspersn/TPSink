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
        //User us = new User();
        //us.yamlRead();
        //us.yamlWrite();
        new MainGUI();
    }

    /**
     * returns main image path
     * @return main image path
     */
    public static String getPathToLogo() {
        return PATH_TO_LOGO;
    }
}

