import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L_2570 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            hm.put(nums1[i][0], hm.getOrDefault(nums1[i][0], 0) + nums1[i][1]);
        }

        for (int i = 0; i < nums2.length; i++) {
            hm.put(nums2[i][0], hm.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        }

        int ans[][] = new int[hm.size()][2];
        int i = 0;

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            ans[i][0] = entry.getKey();
            ans[i][1] = entry.getValue();
            i++;
        }
        Arrays.sort(ans, (a, b) -> Integer.compare(a[0], b[0]));

        return ans;
    }
}
