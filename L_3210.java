public class L_3210 {
    public String getEncryptedString(String s, int k) {

        StringBuilder answer = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            answer = answer.append(s.charAt((i + k) % s.length()));
        }
        return answer.toString();
    }
}
