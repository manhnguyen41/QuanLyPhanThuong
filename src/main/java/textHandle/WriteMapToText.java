package textHandle;

import java.util.Map;

public class WriteMapToText {
    public static String writeMapToText(Map<String, Integer> map) {
        StringBuilder builder = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            builder.append(key).append(": ").append(value).append(", ");
        }

        // Remove the trailing comma and space
        if (builder.length() > 0) {
            builder.setLength(builder.length() - 2);
        }

        return builder.toString();
    }
}
