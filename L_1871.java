import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class L_1871 {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        Queue<Integer> que = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        que.add(0);
        visited.add(0);
        int farthest = 0;

        while (!que.isEmpty()) {
            int i = que.poll();
            if (i == n - 1) {
                return true;
            }
            for (int j = Math.max(i + minJump, farthest + 1); j <= i + maxJump && j < n; j++) {
                if (s.charAt(j) == '0' && !visited.contains(j)) {
                    que.add(j);
                    visited.add(j);
                }
            }
            farthest = Math.max(farthest, i + maxJump);
        }

        return false;
    }
}
