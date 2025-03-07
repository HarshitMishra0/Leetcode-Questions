import java.util.ArrayList;

public class L_2162 {
    public int[] pivotArray(int[] nums, int pivot) {

        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                small.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                large.add(nums[i]);
            }
        }
        int ans[] = new int[nums.length];

        int i = 0;
        int a = 0;
        while (i < small.size()) {
            ans[a] = small.get(i);
            i++;
            a++;
        }

        i = 0;
        while (i < nums.length) {
            if (nums[i] == pivot) {
                ans[a] = nums[i];
                a++;
            }
            i++;
        }

        i = 0;
        while (i < large.size()) {
            ans[a] = large.get(i);
            i++;
            a++;
        }

        return ans;
    }
}
