import java.util.HashSet;

public class L_2554 {
    public int maxCount(int[] banned, int n, int maxSum) {

        HashSet<Integer> arr = new HashSet<Integer>();
        for (int i = 0; i < banned.length; i++) {
            arr.add(banned[i]);
        }

        int answer = 0;
        int sum = 0;
        int a = 1;

        while (a <= n) {
            if (arr.contains(a)) {
                a++;
            } else if (sum + a <= maxSum) {
                answer++;
                sum += a;
                a++;
            } else {
                break;
            }
        }

        return answer;
    }
}
