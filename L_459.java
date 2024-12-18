public class L_459 {
    public boolean repeatedSubstringPattern(String s) {

        String answer = s + s;
        answer = answer.substring(1, answer.length() - 1);
        return answer.contains(s);
    }
}
