public class L_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int answer[] = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int number = Integer.MAX_VALUE;
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    number = nums1[i];
                }

                if (nums2[j] > number) {
                    answer[i] = nums2[j];
                    break;
                } else {
                    answer[i] = -1;
                }
            }
        }

        return answer;
    }
}
