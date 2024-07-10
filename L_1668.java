public class L_1668 {
    public int maxRepeating(String sequence, String word) {
        int answer = 0;
        String newString = word;

        while (sequence.contains(newString)) {
            answer++;
            newString += word;
        }

        return answer;
    }
}
