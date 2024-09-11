import java.util.HashSet;
import java.util.Set;

public class L_874 {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        int direction = 1;

        int furthest = 0;
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        for (int i = 0; i < commands.length; i++) {

            if (commands[i] == -1 || commands[i] == -2) {
                if (commands[i] == -1 && direction != 4) {
                    direction++;
                } else if (commands[i] == -1 && direction == 4) {
                    direction = 1;
                }
                if (commands[i] == -2 && direction != 1) {
                    direction--;
                } else if (commands[i] == -2 && direction == 1) {
                    direction = 4;
                }
            } else {
                if (direction == 1) {
                    int a = commands[i];
                    while (a > 0 && !obstacleSet.contains(x + "," + (y + 1))) {
                        y = y + 1;
                        a--;
                    }
                } else if (direction == 3) {
                    int a = commands[i];
                    while (a > 0 && !obstacleSet.contains(x + "," + (y - 1))) {
                        y = y - 1;
                        a--;
                    }
                } else if (direction == 2) {
                    int a = commands[i];
                    while (a > 0 && !obstacleSet.contains((x + 1) + "," + y)) {
                        x = x + 1;
                        a--;
                    }
                } else if (direction == 4) {
                    int a = commands[i];
                    while (a > 0 && !obstacleSet.contains((x - 1) + "," + y)) {
                        x = x - 1;
                        a--;
                    }
                }
            }
            if (((x * x) + (y * y)) > furthest) {
                furthest = (x * x) + (y * y);
            }
        }
        return furthest;
    }
}
