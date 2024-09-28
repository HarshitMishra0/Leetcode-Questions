import java.util.ArrayList;
import java.util.List;

public class L_386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            fun(i, n, result);
        }

        return result;
    }

    private void fun(int current, int n, List<Integer> result) {
        if (current > n) {
            return;
        }

        result.add(current);

        for (int i = 0; i <= 9; i++) {
            int next = current * 10 + i;
            if (next > n) {
                break;
            }
            fun(next, n, result);
        }
    }
}
