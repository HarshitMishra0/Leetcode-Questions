import java.util.ArrayList;

public class L_682 {
    public int calPoints(String[] operations) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            String a = operations[i];
            if (a.equals("C")) {
                if (!arr.isEmpty()) {
                    arr.remove(arr.size() - 1);
                }
            } else if (a.equals("D")) {
                if (!arr.isEmpty()) {
                    arr.add(2 * arr.get(arr.size() - 1));
                }
            } else if (a.equals("+")) {
                if (arr.size() >= 2) {
                    arr.add(arr.get(arr.size() - 1) + arr.get(arr.size() - 2));
                }
            } else {
                arr.add(Integer.parseInt(a));
            }
        }

        int b = 0;
        int sum = 0;
        while (b < arr.size()) {
            sum += arr.get(b);
            b++;
        }
        return sum;
    }
}
