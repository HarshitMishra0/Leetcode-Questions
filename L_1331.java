import java.util.Arrays;
import java.util.HashMap;

public class L_1331 {
    public int[] arrayRankTransform(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        int ans[] = arr.clone();
        ;
        Arrays.sort(ans);

        int value = 1;

        for (int i = 0; i < ans.length; i++) {
            if (!hm.containsKey(ans[i])) {
                hm.put(ans[i], value);
                value++;
            }
        }

        int[] fin = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int b = hm.get(arr[i]);
            fin[i] = b;
        }

        return fin;
    }
}
