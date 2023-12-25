package textHandle;

import java.util.HashMap;
import java.util.Map;

public class ReadMapFromText {
    public static Map<String, Integer> readMapFromText(String text) {
        Map<String, Integer> map = new HashMap<>();

        String[] pairs = text.split(", ");
        for (String pair : pairs) {
            String[] parts = pair.split(": ");
            if (parts.length == 2) {
                String key = parts[0].trim();
                int value = Integer.parseInt(parts[1].trim());
                map.put(key, value);
            }
        }

        return map;
    }
}
