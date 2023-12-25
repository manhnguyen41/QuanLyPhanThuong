package jsonHandle;

import com.google.gson.Gson;
import org.json.JSONObject;

import java.util.Map;

public class WriteToJson {
    static Gson gson = new Gson();
    public static String mapToJson(Map<String, Integer> map) {
        return gson.toJson(map);
    }
}
