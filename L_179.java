import java.util.Arrays;

public class L_179 {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();
        for (String num : arr) {
            answer.append(num);
        }

        return answer.toString();
    }
}
