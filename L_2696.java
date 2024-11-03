public class L_2696 {
    public int minLength(String s) {

        StringBuilder answer = new StringBuilder(s);

        int i = 0;

        while (i < answer.length() - 1) {
            if ((answer.charAt(i) == 'A' && answer.charAt(i + 1) == 'B')
                    || (answer.charAt(i) == 'C' && answer.charAt(i + 1) == 'D')) {
                answer.deleteCharAt(i + 1);
                answer.deleteCharAt(i);
                i = 0;
            } else {
                i++;
            }
        }
        return answer.length();
    }
}
