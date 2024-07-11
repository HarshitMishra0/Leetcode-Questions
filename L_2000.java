public class L_2000 {
    public String reversePrefix(String word, char ch) {
        boolean exists = word.contains(Character.toString(ch));
        String answer = "";

        if (exists) {
            int a = word.indexOf(ch);
            int i = a;
            while (i >= 0) {
                answer = answer + word.charAt(i);
                i--;
            }
            for (int j = a + 1; j < word.length(); j++) {
                answer = answer + word.charAt(j);
            }
        } else {
            return word;
        }
        return answer;
    }
}
