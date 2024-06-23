public class L_1342 {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            int temp = num % 10;
            if (temp % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }
}
