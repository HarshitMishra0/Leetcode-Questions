public class L_441 {
    public int arrangeCoins(int n) {

        int i = 1;
        while (n > 0) {
            n = n - i;
            i++;
        }

        if (n < 0) {
            return i - 2;
        }
        return i - 1;
    }
}
