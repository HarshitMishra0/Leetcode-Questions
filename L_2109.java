public class L_2109 {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();

        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (a < spaces.length && i == spaces[a]) {
                sb.append(" ");
                a++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
