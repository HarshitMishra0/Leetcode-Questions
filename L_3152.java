public class L_3152 {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] parity = new int[n];

        for (int i = 0; i < n - 1; i++) {
            parity[i] = (nums[i] % 2) == (nums[i + 1] % 2) ? 1 : 0;
        }

        int[] prefixSum = new int[n];
        for (int i = 0; i < n - 1; i++) {
            prefixSum[i + 1] = prefixSum[i] + parity[i];
        }

        boolean[] answer = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];

            answer[i] = (prefixSum[b] - prefixSum[a]) == 0;
        }

        return answer;
    }
}
