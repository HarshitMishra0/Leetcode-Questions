public class L_189 {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        int arr[] = new int[nums.length];
        for (int i = 0; i < arr.length - k; i++) {
            arr[i + k] = nums[i];
        }
        int a = 0;
        for (int i = arr.length - k; i < arr.length; i++) {
            arr[a] = nums[i];
            a++;
        }

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

    }
}
