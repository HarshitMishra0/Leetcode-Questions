public class L_3163 {
    public String compressedString(String word) {

        String answer = "";

        int number = 0;
        int a = 0;

        while (number < word.length()) {
            a++;

            if (a == 9) {
                answer = answer + a + word.charAt(number);
                a = 0;
            } else if (number != word.length() - 1 && word.charAt(number) == word.charAt(number + 1)) {

            } else {
                answer = answer + a + word.charAt(number);
                a = 0;
            }
            number++;
        }
        return answer;
    }
}
