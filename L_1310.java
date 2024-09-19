import java.util.HashMap;

public abstract class L_1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ;

        for (int i = 0; i < arr.length; i++) {
            hm.put(i, arr[i]);
        }

        int answer[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            if (a == b) {
                answer[i] = arr[a];
            } else {
                int diff = b - a;
                int k = arr[a];
                for (int j = 1; j <= diff; j++) {
                    k = k ^ arr[a + j];
                }
                answer[i] = k;
            }

        }

        return answer;
    }
}
