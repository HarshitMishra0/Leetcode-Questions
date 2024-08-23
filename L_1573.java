public class L_1573 {
    public int numWays(String s) {
        int oneCount = 0;
        double n = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
            }
        }

        int b = oneCount % 3;
        long mod = 1000000007;
        if (oneCount == 0) {
            return (int) ((((n - 1) * (n - 2)) / 2) % mod);
        }

        if (b != 0) {
            return 0;
        }

        int a = 0;
        double ways1 = 0;
        double ways2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                a++;
            }
            if (a == oneCount / 3) {
                ways1++;
            }
            if (a == (oneCount / 3) * 2) {
                ways2++;
            }
        }

        return (int) ((ways1 * ways2) % mod);
    }
}
