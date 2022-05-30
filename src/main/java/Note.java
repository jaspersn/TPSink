import java.io.File;
import java.io.IOException;

/**
 * Class that handles the creation of notes in the form of {@link Note#fileType} files.
 * @author Jasper Newkirk
 * @version 1.0.0
 */
public class Note {
    /**
     * The default file type.
     */
    public static final String fileType = ".docx";

    /**
     * Constructs a new file with the given {@code fileName} in the given {@code path}. This new file will be
     * a {@link Note#fileType} file.
     * @param fileName the name of the file to be created.
     * @param path the parent directory of the file.
     */
    public Note(String fileName, String path) {
        // TODO: Test this
        String filePath = path + "\\" + fileName;
        File f = new File(filePath + ".docx");
        int i = 1;
        while (f.exists()) {
            f = new File(filePath + "(" + i++ + ").docx");
        }
        try {
            f.createNewFile();
        } catch (IOException ex) {
        }
    }
}
