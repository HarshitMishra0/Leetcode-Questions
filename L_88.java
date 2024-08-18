public class L_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m + n];
        int a = 0;
        int b = 0;
        int i = 0;
        while (a < m && b < n) {
            if (nums1[a] < nums2[b]) {
                arr[i] = nums1[a];
                i++;
                a++;
            } else {
                arr[i] = nums2[b];
                i++;
                b++;
            }
        }

        while (a < m) {
            arr[i] = nums1[a];
            i++;
            a++;
        }
        while (b < n) {
            arr[i] = nums2[b];
            i++;
            b++;
        }

        for (int f = 0; f < arr.length; f++) {
            nums1[f] = arr[f];
        }
    }
}
