import java.util.ArrayList;
import java.util.List;

public class L_2788 {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> arr = new ArrayList<>();
        String a = "\\" + separator;

        for (int i = 0; i < words.size(); i++) {
            String[] ans = words.get(i).split(a);
            for (int j = 0; j < ans.length; j++) {
                if (!ans[j].isEmpty()) {
                    arr.add(ans[j]);
                }
            }
        }
        return arr;
    }
}
