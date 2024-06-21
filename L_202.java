public class L_202 {
    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        slow = squared(slow);
        fast = squared(squared(fast));

        while (slow != fast) {
            slow = squared(slow);
            fast = squared(squared(fast));
        }

        if (slow == 1) {
            return true;
        }

        return false;
    }

    public static int squared(int n) {
        int answer = 0;
        while (n > 0) {
            int temp = n % 10;
            answer = answer + temp * temp;
            n = n / 10;
        }
        return answer;
    }
}
