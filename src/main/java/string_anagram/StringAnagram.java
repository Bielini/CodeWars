package string_anagram;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class StringAnagram {

    public static boolean check(String one, String two) {

        one = one.toLowerCase(Locale.ROOT);
        two = two.toLowerCase(Locale.ROOT);
        Character temp;

        if (one.length() != two.length()) {
            return false;
        }

        Map<Character, Integer> mapOne = convertToMap(one);
        Map<Character, Integer> mapTwo = convertToMap(two);




        for (Map.Entry<Character, Integer> mapOneEntry : mapOne.entrySet()) {
            if (mapOneEntry.getValue() != mapTwo.get(mapOneEntry.getKey())){
                return false;
            }
        }
        return true;
    }

    private static Map<Character,Integer> convertToMap(String one) {
        Map<Character, Integer> map = new HashMap<>();

        Character temp;

        for (int i = 0; i < one.length(); i++) {
            temp = one.charAt(i);
            if (map.containsKey(temp)) {
                Integer value = map.get(temp);
                map.replace(temp, value, value + 1);
            } else {
                map.put(temp, 1);
            }
        }
        return map;
    }
}
