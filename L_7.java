public class L_7 {
    public int reverse(int x) {
        int answer = 0;

        if (x > 0) {
            while (x > 0) {
                int temp = x % 10;
                if (answer < Integer.MIN_VALUE / 10 || answer > Integer.MAX_VALUE / 10) {
                    return 0;
                }
                answer = answer * 10 + temp;

                x = x / 10;
            }
        } else {
            while (x < 0) {
                int temp = x % 10;
                if (answer < Integer.MIN_VALUE / 10 || answer > Integer.MAX_VALUE / 10) {
                    return 0;
                }
                answer = answer * 10 + temp;

                x = x / 10;
            }
        }
        return answer;
    }
}
