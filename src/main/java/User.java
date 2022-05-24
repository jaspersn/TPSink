import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class User {
    private String userName;
    private String password;
    private int userNumber;
    private String[] userList;
    private RoomTester RT;

    private ObjectMapper objMap = new ObjectMapper(new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER));

    public User(){}
    public User(String xavier, String s, int i, String[] f, RoomTester r) {
        userName = xavier;
        password = s;
        userNumber = i;
        userList = f;
        RT = r;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String[] getUserList() {
        return userList;
    }

    public void setUserList(String[] userList) {
        this.userList = userList;
    }

    public RoomTester getRT() {
        return RT;
    }

    public void setRT(RoomTester RT) {
        this.RT = RT;
    }

    @Override
    public String toString() {
        return "\nname: " + userName + "\npassword: " + password + "\nnumber: " + userNumber
                + "\nList: " + Arrays.toString(userList) + "\nAppliances: " + RT;
    }



    public void yamlCall() throws Exception {
        File ymlFile = new File("src/main/DataFiles/UserInfo.yml");
        User TDA = objMap.readValue(ymlFile, User.class);
        System.out.println(TDA.toString());


    }

    public void yamlWrite() throws IOException {
        objMap.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        RoomTester RT = new RoomTester(
                new String[]{"Washer", "Dryer", "Sink"}
        );
        User TDA = new User(
                "Jasper",
                "1234",
                10,
                new String[]{"HI", "bye", "ugh", "sure"},
                RT
        );


        objMap.writeValue(new File("src/main/DataFiles/UserInfo.yml"), TDA);
    }
}
