import java.util.HashMap;

public class L_1371 {
    public int findTheLongestSubstring(String s) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("00000", -1);

        int[] vowelCount = new int[5];
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a') {
                vowelCount[0]++;
            } else if (ch == 'e') {
                vowelCount[1]++;
            } else if (ch == 'i') {
                vowelCount[2]++;
            } else if (ch == 'o') {
                vowelCount[3]++;
            } else if (ch == 'u') {
                vowelCount[4]++;
            }

            String state = getState(vowelCount);

            if (map.containsKey(state)) {
                maxLength = Math.max(maxLength, i - map.get(state));
            } else {
                map.put(state, i);
            }
        }

        return maxLength;
    }

    private String getState(int[] vowelCount) {
        StringBuilder sb = new StringBuilder();
        for (int count : vowelCount) {
            sb.append(count % 2 == 0 ? "0" : "1");
        }
        return sb.toString();
    }
}
