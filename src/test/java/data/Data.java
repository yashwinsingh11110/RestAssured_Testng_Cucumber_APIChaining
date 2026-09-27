package data;

import org.json.JSONArray;
import org.json.JSONObject;

public class Data {
    public JSONArray userSubject = new JSONArray();
    public JSONObject userData = new JSONObject();

    public Data(){
        userSubject.put("Mathematics");
        userSubject.put("Chemistry");
        userSubject.put("Physics");
    
        userData.put("Name", "Groot");
        userData.put("Age", 30);
        userData.put("Course", "BCA");
        userData.put("Subject", userSubject);

    }

    public String getData(){
        return userData.toString();
    }

}
