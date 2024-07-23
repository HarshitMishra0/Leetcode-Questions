public class L_771 {
    public int numJewelsInStones(String jewels, String stones) {
        int answer = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char a = jewels.charAt(i);
            String b = "" + a;
            if (stones.contains(b)) {
                answer = answer + find(stones, a);
            }
        }
        return answer;
    }

    public int find(String stones, char a) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (stones.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
