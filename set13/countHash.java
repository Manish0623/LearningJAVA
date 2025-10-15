import java.util.*;
import java.util.regex.*;

public class countHash {
    public static Map<String, Integer> countHashtagFrequency(String text) {
        Map<String, Integer> freqMap = new HashMap<>();
        Pattern pattern = Pattern.compile("#(\\w+)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String tag = "#" + matcher.group(1).toLowerCase();
            freqMap.put(tag, freqMap.getOrDefault(tag, 0) + 1);
        }
        return freqMap;
    }

    public static void main(String[] args) {
        String input = "#Java is a coding language! #Coding in #Java is little difficult.";

        Map<String, Integer> frequencies = countHashtagFrequency(input);

        // Print the results
        System.out.println("Hashtag Frequencies:");
        for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
