public class L_657 {
    public boolean judgeCircle(String moves) {
        int first = 0;
        int second = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                first += 1;
            } else if (moves.charAt(i) == 'L') {
                first -= 1;
            } else if (moves.charAt(i) == 'U') {
                second -= 1;
            } else if (moves.charAt(i) == 'D') {
                second += 1;
            }
        }

        if (first == 0 && second == 0) {
            return true;
        }
        return false;
    }
}
