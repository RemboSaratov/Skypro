package course_2.hw_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 7, 1, 2, 3, 4, 4, 5, 5, 6));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println();

        Set<Integer> numsUniq = new HashSet<>(nums);
        Collections.sort(nums);
        for (Integer num : numsUniq) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println();

        Set<String> stringsUniq = new HashSet<>(strings);
        System.out.println(stringsUniq);

        System.out.println();

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : strings) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        wordCount.values().forEach(System.out::println);
        // или
        System.out.println(wordCount);
    }
}
