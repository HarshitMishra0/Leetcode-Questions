public class L_73 {
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int column = matrix[0].length;
        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    int a = 0;
                    int b = 0;
                    while (a < arr[i].length) {
                        matrix[i][a] = 0;
                        a++;
                    }
                    while (b < arr.length) {
                        matrix[b][j] = 0;
                        b++;
                    }
                }
            }
        }
    }
}
