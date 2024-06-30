import java.util.List;

public class L_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;

        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
                counter++;
            } else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
                counter++;
            } else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
                counter++;
            }
        }
        return counter;
    }
}
