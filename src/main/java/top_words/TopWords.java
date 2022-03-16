package top_words;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TopWords {

    public static List<String> top3(String s) {
        Map<String, Integer> result = new HashMap<>();
        List<String> resultList = new ArrayList<>();


        List<String> strings = Arrays.stream(s
                        .toLowerCase(Locale.ROOT)
                        .replaceAll("[^a-z' ]", "")
                        .trim()
                        .split(" ")).collect(Collectors.toList());


        for (String string : strings) {

            if (Pattern.matches("[']?[a-z]+[']?[a-z][']?|[a-z]", string)) {
                if (result.containsKey(string)) {
                    result.replace(string, result.get(string), result.get(string) + 1);
                } else {
                    result.put(string, 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> collect = result.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .toList();

        for (int i = collect.size() - 1; i >= 0; i--) {
            if (i > collect.size() - 4) {
                resultList.add(collect.get(i).getKey());
            }
        }
        return resultList;
    }
}