public class L_2275 {
    public int largestCombination(int[] candidates) {

        int arr[] = new int[24];

        for (int i = 0; i < candidates.length; i++) {
            for (int j = 23; j >= 0 && candidates[i] > 0; j--) {
                arr[j] = arr[j] + (int) (candidates[i] & 1);
                candidates[i] = candidates[i] >> 1;
            }
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > count) {
                count = arr[i];
            }
        }
        return count;
    }
}
