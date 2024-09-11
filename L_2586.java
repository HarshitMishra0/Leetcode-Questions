import java.util.ArrayList;

public class L_2586 {
    public int vowelStrings(String[] words, int left, int right) {

        int answer = 0;
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('a');
        arr.add('e');
        arr.add('i');
        arr.add('o');
        arr.add('u');

        for (int i = left; i <= right; i++) {
            if (arr.contains(words[i].charAt(0)) && arr.contains(words[i].charAt(words[i].length() - 1))) {
                answer++;
            }
        }
        return answer;
    }
}
