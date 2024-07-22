public class L_2108 {
    public String firstPalindrome(String[] words) {
        String answer = "";

        for (int i = 0; i < words.length; i++) {
            boolean palindrome = palindrom(words[i]);
            if (palindrome == true) {
                return words[i];
            }
        }
        return answer;
    }

    public boolean palindrom(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
