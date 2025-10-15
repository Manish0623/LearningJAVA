import java.util.*;
import java.util.regex.*;

public class HashTag1 {
    public static Set<String> HashTag1(String text) {
        Set<String> uniqueTags = new HashSet<>();
        Pattern pattern = Pattern.compile("#(\\w+)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            uniqueTags.add("#" + matcher.group(1).toLowerCase());
        }

        return uniqueTags;
    }

    public static void main(String[] args) {
        String input = "Learning #Java and #java and #Coding";
        System.out.println(HashTag1(input)); // Output: [#java, #coding]
    }
}
