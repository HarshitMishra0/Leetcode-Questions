public class L_1304 {
    public int[] sumZero(int n) {

        int arr[] = new int[n];

        int counter1 = 1;
        int counter2 = -1;

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                arr[i] = counter1++;
            } else if (i == arr.length / 2 && n % 2 != 0) {
                arr[i] = 0;
            } else {
                arr[i] = counter2--;
            }

        }

        return arr;

    }

}
