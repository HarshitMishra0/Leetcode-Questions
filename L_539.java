import java.util.Arrays;
import java.util.List;

public class L_539 {
    public int findMinDifference(List<String> timePoints) {

        int arr[] = new int[timePoints.size()];

        for (int i = 0; i < timePoints.size(); i++) {
            String a = timePoints.get(i);

            int hour = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) * 60;
            int minutes = hour + ((a.charAt(3) - '0') * 10 + (a.charAt(4) - '0'));
            arr[i] = minutes;
        }

        Arrays.sort(arr);

        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i + 1] - arr[i];
            if (a < minimum) {
                minimum = a;
            }
        }
        int wrapAroundDiff = (1440 - arr[arr.length - 1]) + arr[0];
        minimum = Math.min(minimum, wrapAroundDiff);

        return minimum;
    }
}
