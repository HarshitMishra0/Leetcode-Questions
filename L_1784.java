public class L_1784 {
    public boolean checkOnesSegment(String s) {
        boolean answer = true;
        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            if (found == true && s.charAt(i - 1) != '1' && s.charAt(i) == '1') {
                return false;
            }
            if (s.charAt(i) == '1') {
                found = true;
            }
        }
        return answer;
    }
}
