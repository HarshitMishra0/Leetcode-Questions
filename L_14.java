public class L_14 {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";

        int a = 0;

        while (a < strs[0].length()) {
            boolean contains = true;
            for (int i = 0; i < strs.length; i++) {
                if (a < strs[i].length() && strs[0].charAt(a) != strs[i].charAt(a)) {
                    contains = false;
                } else if (a >= strs[i].length()) {
                    contains = false;
                }
            }
            if (contains) {
                answer = answer + strs[0].charAt(a);
            } else {
                break;
            }
            a++;
        }
        return answer;
    }
}
