public class L_1832 {
    public boolean checkIfPangram(String sentence) {

        boolean[] answer = new boolean[26];
        boolean pan = true;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                answer[ch - 'a'] = true;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == false) {
                pan = false;
            }
        }

        return pan;
    }
}
