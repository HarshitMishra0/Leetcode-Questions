public class L_2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {

        if (original.length != m * n) {
            return new int[0][0];
        }
        int arr[][] = new int[m][n];
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = original[a];
                a++;
            }
        }
        return arr;
    }
}
