public class L_1684 {
    public int countConsistentStrings(String allowed, String[] words) {

        int answer = words.length;

        for (int i = 0; i < words.length; i++) {
            String b = words[i];
            for (int j = 0; j < b.length(); j++) {
                String a = "" + b.charAt(j);
                if (!allowed.contains(a)) {
                    answer--;
                    break;
                }
            }

        }
        return answer;
    }
}
