import java.io.File;

/**
 * A representation of a {@link Appliance} object including a name and other optional fields.
 * @author Jasper Newkirk
 */
public class Appliance {
    /**
     * The name of the current {@link Appliance}.
     */
    private final String name;
    /**
     * The description of the current {@link Appliance}.
     */
    private final String description;

    /**
     * Constructs a new {@link Appliance} with the given {@code name}. And creates a corresponding folder in the given {@code path}.
     * @author Jasper Newkirk
     * @param name The name to be givn to the current {@link Appliance}.
     * @param path The path to the directory associated to the current {@link Appliance}.
     */
    public Appliance(String name, String path) {
        this(name, path, "");
    }

    /**
     * Constructs a new {@link Appliance} with the given {@code name}. And creates a corresponding folder in the given {@code path}.
     * @author Jasper Newkirk
     * @param name The name to be givn to the current {@link Appliance}.
     * @param path The path to the directory associated to the current {@link Appliance}.
     * @param description The description of the current {@link Appliance}.
     */
    public Appliance(String name, String path, String description) {
        File room = new File(path + "\\" + name);
        int i = 1;
        while (!room.mkdir()) {
            room = new File(path + "\\" + name + "(" + i++ + ")");
        }
        name += "(" + i + ")";
        this.name = name;
        this.description = description;
    }
}
