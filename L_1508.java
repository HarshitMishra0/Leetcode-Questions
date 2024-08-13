import java.util.ArrayList;
import java.util.Collections;

public class L_1508 {
    public int rangeSum(int[] nums, int n, int left, int right) {

        ArrayList<Integer> arr = new ArrayList<>();
        int mod = 1000000007;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                arr.add(sum + nums[j]);
                sum = sum + nums[j];
            }
        }
        Collections.sort(arr);
        int answer = 0;
        for (int i = left - 1; i < right; i++) {
            answer = (answer + arr.get(i)) % mod;
        }
        return answer;
    }
}
