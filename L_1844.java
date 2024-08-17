public class L_1844 {
    public String replaceDigits(String s) {
        String b = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int a = (s.charAt(i - 1) - '0') + s.charAt(i);
                b = b + (char) (a);
            } else {
                b = b + ch;
            }
        }
        return b;
    }
}
