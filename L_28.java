public class L_28 {
    public int strStr(String haystack, String needle) {

        boolean answer = haystack.contains(needle);

        if (answer == false) {
            return -1;
        }

        int index = haystack.indexOf(needle);
        return index;
    }
}
