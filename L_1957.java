public class L_1957 {
    public String makeFancyString(String s) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 2 && s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
                continue;
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}