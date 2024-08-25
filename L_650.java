import java.util.ArrayList;

public class L_650 {
    public int minSteps(int n) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                arr.add(i);
                n /= i;
            }
        }

        int answer = 0;
        for (int i = 0; i < arr.size(); i++) {
            answer = answer + arr.get(i);
        }
        return answer;
    }
}
