import java.io.File;
/**
 * Holds file related functionality for the {@link GridTemplateGUI} class.
 * @author Jasper Newkirk
 * @version 1.0.0
 */
public class GridTemplate {
    /**
     * Creates and returns the child paths and files in the given {@code dir} directory as a {@link File} array.
     * @param dir the directory to be loaded from.
     * @return the child paths and files in the given {@code dir} directory as a {@link File} array or
     * {@code null} if the directory is empty.
     */
    static File[] loadDir(String dir) {
        File f = new File(dir);
//        System.out.print(f.getPath());
//        System.out.print(f.isDirectory());
        if (f.exists() && f.isDirectory()) return f.listFiles();
        return null;
    }
}
