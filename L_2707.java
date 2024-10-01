import java.util.HashSet;

public class L_2707 {
    public int minExtraChar(String s, String[] dictionary) {
        HashSet<String> dictSet = new HashSet<>();
        for (String word : dictionary) {
            dictSet.add(word);
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 0; j < i; j++) {
                String subStr = s.substring(j, i);
                if (dictSet.contains(subStr)) {
                    dp[i] = Math.min(dp[i], dp[j]);
                }
            }
        }
        return dp[n];
    }
}