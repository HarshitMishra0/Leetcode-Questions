public class L_796 {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String answer = s + s;

        if (answer.contains(goal)) {
            return true;
        } else {
            return false;
        }
    }
}
