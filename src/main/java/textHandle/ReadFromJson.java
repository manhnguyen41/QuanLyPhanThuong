package textHandle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Map;

public class ReadFromJson {
    static Gson gson = new Gson();
    public static Map<String, Integer> jsonToMap(String json) {
        return gson.fromJson(json, new TypeToken<Map<String, Integer>>() {}.getType());
    }
}
