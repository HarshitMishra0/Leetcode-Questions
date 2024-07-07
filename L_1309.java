public class L_1309 {
    public String freqAlphabets(String s) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 2 && s.charAt(i + 2) == '#') {
                int a = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
                ;
                char ch = (char) ('a' + a - 1);
                answer.append(ch);
                i = i + 2;
            } else {
                char ch = (char) ('a' + s.charAt(i) - '1');
                answer.append(ch);
            }
        }

        String yes = answer.toString();

        return yes;
    }
}
