public class L_2825 {
    public boolean canMakeSubsequence(String str1, String str2) {

        int i = 0;
        int j = 0;

        while (i < str1.length() && j < str2.length()) {
            char current = str1.charAt(i);
            char nextValue = str1.charAt(i) == 'z' ? 'a' : (char) (str1.charAt(i) + 1);
            if (current == str2.charAt(j) || nextValue == str2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        if (j == str2.length()) {
            return true;
        } else {
            return false;
        }
    }
}
