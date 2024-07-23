public class L_3110 {
    public int scoreOfString(String s) {

        int answer = 0;
        for (int i = 1; i < s.length(); i++) {
            answer = answer + Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return answer;
    }
}
