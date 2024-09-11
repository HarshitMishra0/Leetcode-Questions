public class L_1894 {
    public int chalkReplacer(int[] chalk, int k) {
        int i = 0;

        while (k > 0) {
            k = k - chalk[i];
            if (k < 0) {
                return i;
            }
            if (i == chalk.length - 1) {
                i = 0;
            } else {
                i++;
            }
        }
        return i;
    }
}
