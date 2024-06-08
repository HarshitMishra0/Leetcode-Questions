public class L_1704 {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int firstHalf = 0;
        int secondHalf = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                firstHalf++;
            }
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                secondHalf++;
            }
        }

        if (firstHalf == secondHalf) {
            return true;
        }
        return false;
    }
}
