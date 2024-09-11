public class L_2028 {
    public int[] missingRolls(int[] rolls, int mean, int n) {

        int a = 0;
        for (int i = 0; i < rolls.length; i++) {
            a = a + rolls[i];
        }

        int x = (mean * (rolls.length + n)) - a;

        if (x > 6 * n) {
            return new int[] {};
        }

        if (x < 1 * n) {
            return new int[] {};
        }
        int arr[] = new int[n];
        int baseValue = x / n;
        int remainder = x % n;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = baseValue + (i < remainder ? 1 : 0);
        }
        return arr;
    }
}
