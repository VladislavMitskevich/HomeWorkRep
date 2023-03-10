package hw03.task01.custom_functional_interface;

import java.util.Map;

@FunctionalInterface
public interface MapToString {
    String getStringFromMap(Map<String, String> map);
}
