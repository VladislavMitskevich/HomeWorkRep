package hw03.task01;

import hw03.task01.custom_functional_interface.ArrayToMap;
import hw03.task01.custom_functional_interface.MapToString;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task01 implements ArrayToMap, MapToString {



    public Map<String, String> getMapFromArray(String[] string) {
        ArrayToMap aM = (String[] s) -> {
            Map<String, String> hashMap = new LinkedHashMap<>();
            for (int i = 0; i < s.length; i += 2) {
                hashMap.put(s[i], s[i + 1]);
            }
            return hashMap;
        };
        return (aM.getMapFromArray(string));
    }


    public String getStringFromMap(Map<String, String> map) {
        MapToString mS = (maps) -> {
            StringBuilder stringBuilder = new StringBuilder();
            for (String key : map.keySet()) {
                stringBuilder.append(key + ":" + map.get(key) + ", ");
            }
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            return stringBuilder.toString();
        };
        return (mS.getStringFromMap(map));
    }
}
