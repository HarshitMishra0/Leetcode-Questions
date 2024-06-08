public class L_26 {
    public int removeDuplicates(int[] nums) {

        int i = 0;
        int k = 0;
        int[] arr = new int[nums.length];
        int a = 0;

        while (i < nums.length) {
            if (i != nums.length - 1 && nums[i + 1] == nums[i]) {
                k++;
            } else {
                arr[a] = nums[i];
                a++;
            }
            i++;
        }

        for (int j = 0; j < nums.length; j++) {
            nums[j] = arr[j];
        }

        return nums.length - k;

    }
}
