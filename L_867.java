public class L_867 {
    public int[][] transpose(int[][] matrix) {

        int[][] answer = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j) {
                    answer[j][i] = matrix[i][j];
                } else {
                    answer[i][j] = matrix[i][j];
                }
            }
        }
        return answer;
    }
}
