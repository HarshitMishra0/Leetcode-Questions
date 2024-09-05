public class L_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] mergedArray = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i < n) {
            mergedArray[k++] = nums1[i++];
        }

        while (j < m) {
            mergedArray[k++] = nums2[j++];
        }

        int len = mergedArray.length;
        if (len % 2 == 1) {
            return mergedArray[len / 2];
        } else {
            return (mergedArray[(len / 2) - 1] + mergedArray[len / 2]) / 2.0;
        }
    }
}
