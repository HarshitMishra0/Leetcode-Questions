public class L_13 {
    public int romanToInt(String s) {
        int answer = 0;

        if (s.charAt(0) == 'M') {
            answer += 1000;
        } else if (s.charAt(0) == 'D') {
            answer += 500;
        } else if (s.charAt(0) == 'C') {
            answer += 100;
        } else if (s.charAt(0) == 'L') {
            answer += 50;
        } else if (s.charAt(0) == 'X') {
            answer += 10;
        } else if (s.charAt(0) == 'V') {
            answer += 5;
        } else if (s.charAt(0) == 'I') {
            answer += 1;
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'M' && s.charAt(i - 1) != 'C') {
                answer = answer + 1000;
            } else if (s.charAt(i) == 'D' && s.charAt(i - 1) != 'C') {
                answer = answer + 500;
            } else if (s.charAt(i) == 'C' && s.charAt(i - 1) != 'X') {
                answer = answer + 100;
            } else if (s.charAt(i) == 'L' && s.charAt(i - 1) != 'X') {
                answer = answer + 50;
            } else if (s.charAt(i) == 'X' && s.charAt(i - 1) != 'I') {
                answer = answer + 10;
            } else if (s.charAt(i) == 'V' && s.charAt(i - 1) != 'I') {
                answer = answer + 5;
            } else if (s.charAt(i) == 'I') {
                answer = answer + 1;
            } else if (s.charAt(i) == 'V' && s.charAt(i - 1) == 'I') {
                answer = answer + 4 - 1;
            } else if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'I') {
                answer = answer + 9 - 1;
            } else if (s.charAt(i) == 'L' && s.charAt(i - 1) == 'X') {
                answer = answer + 40 - 10;
            } else if (s.charAt(i) == 'C' && s.charAt(i - 1) == 'X') {
                answer = answer + 90 - 10;
            } else if (s.charAt(i) == 'D' && s.charAt(i - 1) == 'C') {
                answer = answer + 400 - 100;
            } else if (s.charAt(i) == 'M' && s.charAt(i - 1) == 'C') {
                answer = answer + 900 - 100;
            }
        }
        return answer;
    }
}
