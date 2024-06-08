public class L_58 {
    public int lengthOfLastWord(String s) {

        s = s.trim();

        int space = s.lastIndexOf(' ');

        return s.length() - 1 - space;
    }
}
