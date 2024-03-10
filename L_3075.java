import java.util.Arrays;

public class L_3075 {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int a = happiness.length;
        int b = 0, c = a - 1;
        long fin = 0;

        while (b < k) {
            fin += Math.max(0, happiness[c] - b);
            b++;
            c--;
        }

        return fin;
    }
}
