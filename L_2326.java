public class L_2326 {
    public int[][] spiralMatrix(int m, int n, ListNode head) {

        int answer[][] = new int[m][n];
        int top = 0;
        int left = 0;
        int bottom = m - 1;
        int right = n - 1;

        ListNode temp = head;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                if (temp != null) {
                    answer[top][i] = temp.val;
                    temp = temp.next;
                } else {
                    answer[top][i] = -1;
                }
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                if (temp != null) {
                    answer[i][right] = temp.val;
                    temp = temp.next;
                } else {
                    answer[i][right] = -1;
                }
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    if (temp != null) {
                        answer[bottom][i] = temp.val;
                        temp = temp.next;
                    } else {
                        answer[bottom][i] = -1;
                    }
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    if (temp != null) {
                        answer[i][left] = temp.val;
                        temp = temp.next;
                    } else {
                        answer[i][left] = -1;
                    }
                }
                left++;
            }
        }
        return answer;
    }
}
