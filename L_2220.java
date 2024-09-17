public class L_2220 {
    public int minBitFlips(int start, int goal) {

        int a = start ^ goal;

        return Integer.bitCount(a);
    }
}
