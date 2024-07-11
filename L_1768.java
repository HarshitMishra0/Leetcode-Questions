public class L_1768 {
    public String mergeAlternately(String word1, String word2) {
        String str = "";
        int i = 0;
        while (i < word1.length() && i < word2.length()) {
            str = str + word1.charAt(i);
            str = str + word2.charAt(i);
            i++;
        }

        while (i < word1.length()) {
            str = str + word1.charAt(i);
            i++;
        }
        while (i < word2.length()) {
            str = str + word2.charAt(i);
            i++;
        }
        return str;
    }
}
