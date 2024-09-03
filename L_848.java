public class L_848 {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder(s);
        int a = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            a = (a + shifts[i]) % 26;
            char currentChar = sb.charAt(i);
            int newCharValue = (currentChar - 'a' + a) % 26 + 'a';
            sb.setCharAt(i, (char) newCharValue);
        }
        return sb.toString();
    }
}
