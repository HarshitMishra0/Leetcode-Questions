public class L_3005 {
    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int frequency = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    frequency++;
                }
            }
            arr[i] = frequency;
        }
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int frequency = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                frequency = frequency + max;
            }
        }
        return frequency;
    }
}
