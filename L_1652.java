public class L_1652 {
    public int[] decrypt(int[] code, int k) {

        int ans[] = new int[code.length];

        if (k == 0) {
            for (int i = 0; i < code.length; i++) {
                ans[i] = 0;
            }
        } else if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                int a = k;
                ans[i] = 0;
                while (a > 0) {
                    ans[i] += code[(i + a) % code.length];
                    a--;
                }
            }
        } else {
            for (int i = 0; i < code.length; i++) {
                int a = k;
                ans[i] = 0;
                while (a < 0) {
                    ans[i] += code[((i + a + code.length) % code.length)];
                    a++;
                }
            }
        }

        return ans;
    }
}
