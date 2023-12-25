package textHandle;

import com.google.gson.Gson;

import java.util.Map;

public class WriteToJson {
    static Gson gson = new Gson();
    public static String mapToJson(Map<String, Integer> map) {
        return gson.toJson(map);
    }
}
