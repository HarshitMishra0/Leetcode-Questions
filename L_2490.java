public class L_2490 {
    public boolean isCircularSentence(String sentence) {

        String arr[] = sentence.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i].charAt(arr[i].length() - 1) != arr[i + 1].charAt(0)) {
                return false;
            }
            if (i == arr.length - 1 && arr[i].charAt(arr[i].length() - 1) != arr[0].charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
