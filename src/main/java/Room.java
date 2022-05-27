import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;

import java.io.File;
import java.util.Arrays;

/**
 *  @author Xavier Hines
 * @author Phuoc Le
 *  Date 5/27/2022
 *
 * Room model that will create new .yml as well as read from existing when
 * path is specified. Still needs to be worked.
 *  @version 0.1.0
 */
public class Room {
    private String roomName;
    private String[] applianceList;

    private final ObjectMapper objMap = new ObjectMapper(
            new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER));

    Room() {
        new RoomGUI("User");
    }

    Room(String name, String[] sl) {

    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String[] getApplianceList() {
        return applianceList;
    }

    public void setApplianceList(String[] applianceList) {
        this.applianceList = applianceList;
    }

    public void yamlRead() throws Exception {
        File ymlFile = new File("src/main/DataFiles/RoomInfo.yml");
        Room r = objMap.readValue(ymlFile, Room.class);
        System.out.println(r);
    }

    @Override
    public String toString(){
        return "Room name: " + roomName + "\nAppliance list: " + Arrays.toString(applianceList);
    }
}

