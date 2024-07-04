public class L_1859 {
    public String sortSentence(String s) {

        String[] str = s.split(" ");
        String[] str2 = new String[str.length];

        for (int i = 0; i < str.length; i++) {
            int index = str[i].charAt(str[i].length() - 1) - '1';
            str2[index] = str[i].substring(0, str[i].length() - 1);
        }

        String answer = String.join(" ", str2);

        return answer;

    }
}
