public class L_440 {
    public int findKthNumber(int n, int k) {
        int current = 1;
        k--;

        while (k > 0) {
            int steps = calculateSteps(current, n);

            if (steps <= k) {
                current++;
                k -= steps;
            } else {
                current *= 10;
                k--;
            }
        }

        return current;
    }

    private int calculateSteps(int current, int n) {
        int steps = 0;
        long first = current, last = current;

        while (first <= n) {
            steps += Math.min(n + 1, last + 1) - first;
            first *= 10;
            last = last * 10 + 9;
        }

        return steps;
    }
}
