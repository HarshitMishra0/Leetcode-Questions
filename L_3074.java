public class L_3074 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int n = capacity.length;
        int app = s(apple);
        int c = 0;
        int s = 0;
        for (int i = n - 1; i >= 0; i--) {
            s += capacity[i];
            c++;
            if (s >= app) {
                return c;
            }

        }

        return c;
    }

    public static int s(int[] d) {
        int s = 0;
        for (int i : d) {
            s += i;
        }

        return s;

    }
}
