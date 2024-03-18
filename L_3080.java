import java.util.Arrays;
import java.util.Comparator;

public class L_3080 {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        int arrayLength = nums.length;
        int numQueries = queries.length;
        long[] result = new long[numQueries];
        long currentSum = 0;

        for (int num : nums) {
            currentSum += num;
        }

        int[][] sortedArray = new int[arrayLength][2];
        for (int i = 0; i < arrayLength; i++) {
            sortedArray[i][0] = nums[i];
            sortedArray[i][1] = i;
        }
        Arrays.sort(sortedArray, Comparator.comparingInt(a -> a[0]));

        int[] mark = new int[arrayLength];
        int totalMarked = 0;
        int start = 0;

        for (int i = 0; i < numQueries; i++) {
            int index = queries[i][0];
            int kValue = queries[i][1];

            if (mark[index] == 0) {
                mark[index] = 1;
                currentSum -= nums[index];
                totalMarked++;
            }

            for (int j = start; j < sortedArray.length; j++) {
                if (kValue == 0) {
                    break;
                }

                int value = sortedArray[j][0];
                int idx = sortedArray[j][1];

                if (mark[idx] == 0) {
                    totalMarked++;
                    kValue--;
                    currentSum -= value;
                    mark[idx] = 1;
                }
            }

            result[i] = currentSum;
            totalMarked += kValue;

            if (totalMarked >= arrayLength) {
                break;
            }
        }

        while (result.length != numQueries) {
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = 0;
        }

        return result;
    }
}
