import java.util.ArrayList;

public class L_2053 {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> str = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                String a = arr[i];
                String b = arr[j];
                if (i != j && a.equals(b)) {
                    count++;
                }
            }
            if (count == 0) {
                str.add(arr[i]);
            }
        }

        if (str.size() < k) {
            return "";
        } else {
            return str.get(k - 1);
        }
    }
}
