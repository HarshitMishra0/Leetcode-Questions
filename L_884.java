import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L_884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> wordCount = new HashMap<>();
        List<String> answer = new ArrayList<>();

        String[] ch1 = s1.split(" ");
        String[] ch2 = s2.split(" ");

        for (String word : ch1) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (String word : ch2) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                answer.add(entry.getKey());
            }
        }
        return answer.toArray(new String[0]);
    }
}
