public class L_1967 {
    public int numOfStrings(String[] patterns, String word) {
        int answer = 0;

        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                answer++;
            }
        }

        return answer;
    }
}
