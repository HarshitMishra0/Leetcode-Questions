import java.util.ArrayList;

public class L_349 {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (!arr.contains(nums1[i]) && nums1[i] == nums2[j]) {
                    arr.add(nums1[i]);
                }
            }
        }
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }
}
