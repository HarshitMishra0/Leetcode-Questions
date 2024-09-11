import java.util.ArrayList;
import java.util.List;

public class L_2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(x + "")) {
                arr.add(i);
            }
        }
        return arr;
    }
}
