import java.util.*;
import java.util.regex.*;

public class HashTag2 {
    public static String HashTag2(String text) {
        Pattern pattern = Pattern.compile("#(\\w+)");
        Matcher matcher = pattern.matcher(text);
        Map<String, Integer> freqMap = new HashMap<>();

        while (matcher.find()) {
            String tag = "#" + matcher.group(1).toLowerCase();
            freqMap.put(tag, freqMap.getOrDefault(tag, 0) + 1);
        }

        String mostFrequent = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        String input = "#Java #java #Code #code #java";
        System.out.println("Most Frequent Hashtag: " + HashTag2(input));
        // Output: #java
    }
}
