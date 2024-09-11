public class L_1945 {
    public int getLucky(String s, int k) {

        String number = "";

        for (int i = 0; i < s.length(); i++) {
            number = number + (s.charAt(i) - 'a' + 1);
        }

        int answer = 0;

        while (k > 0) {
            answer = 0;
            for (int i = 0; i < number.length(); i++) {
                int a = number.charAt(i) - '0';
                answer += a;
            }
            number = String.valueOf(answer);
            k--;
        }
        return answer;
    }
}
