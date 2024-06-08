public class L_1732 {
    public int largestAltitude(int[] gain) {

        int[] arr = new int[gain.length + 1];
        int sum = 0;
        arr[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            sum = sum + gain[i];
            arr[i + 1] = sum;

        }
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;

    }
}
