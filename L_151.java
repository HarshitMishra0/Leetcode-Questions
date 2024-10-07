public class L_151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String answer = "";

        for (int i = words.length - 1; i >= 0; i--) {
            answer = answer + words[i].trim() + " ";
        }
        return answer.trim();
    }
}
