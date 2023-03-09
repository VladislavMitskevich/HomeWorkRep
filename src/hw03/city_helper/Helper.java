package hw03.city_helper;

import hw03.city_helper.Comparsion1.Comparsion1;
import hw03.city_helper.Comparsion1.ComparsionName;
import hw03.city_helper.Comparsion1.Equal;
import hw03.city_helper.Comparsion1.EqualsName;

import java.util.*;

public class Helper {
    private static List<String> listWithNames(List<String> allName, Comparsion1 cs1) {
        List<String> list = new ArrayList<>();
        for (String name : allName) {
            if (cs1.isEqual(name)) {
                list.add(name);
            }
        }
        return list;
    }

    public static Collection<String> uniqueCity(List<String> allName) {
        Collection<String> result = new ArrayList<>();
        if (!allName.isEmpty()) {
            Set<String> unique = new HashSet<>(allName);
            result.addAll(unique);
        }
        return result;
    }

    public static List<String> nameLonger6(List<String> allName) {
        Comparsion1 cs1 = ComparsionName::isLongName;
        return listWithNames(allName, cs1);
    }

    public static Collection<String> nameStartWithChar(List<String> allName, Character ch) {
        Collection<String> result = new ArrayList<>();
        for (String name : allName) {
            Equal equal = ((ch1, ch2) -> ch1 ==ch2);
            if (equal.isEqual(name.charAt(0),ch)){
                result.add(name);
            }
        }
        return result;
    }

    public int getCount(List<String> allName, String name){
        EqualsName equalName = (String n) -> n == name;
        return count(allName, equalName);
    }

    private static int count(List<String> allName, EqualsName cs) {
        int count = 0;
        for (String name : allName) {
            if (cs.isEqual(name)) {
                count++;
            }
        }
        return count;
    }
}
