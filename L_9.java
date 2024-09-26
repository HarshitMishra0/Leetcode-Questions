public class L_9 {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);

        int a = 0;
        int b = s.length() - 1;
        while (a < b) {
            if (s.charAt(a) != s.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
