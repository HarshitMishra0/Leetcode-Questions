import java.util.ArrayList;

public class L_2058 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode temp = head.next;
        ListNode prev = head;
        ArrayList<Integer> arr = new ArrayList<>();
        int p = 2;
        int element = 0;

        while (temp.next != null) {
            if (temp.val > prev.val && temp.val > temp.next.val) {
                arr.add(p);
                p++;
                element++;
                temp = temp.next;
                prev = prev.next;
            } else if (temp.val < prev.val && temp.val < temp.next.val) {
                arr.add(p);
                p++;
                element++;
                temp = temp.next;
                prev = prev.next;
            } else {
                p++;
                temp = temp.next;
                prev = prev.next;
            }
        }

        if (element == 0 || element == 1) {
            return new int[] { -1, -1 };
        }

        int maximumD = arr.get(element - 1) - arr.get(0);
        int minimumD = Integer.MAX_VALUE;
        int i = 1;
        while (i < arr.size()) {
            int distance = arr.get(i) - arr.get(i - 1);
            if (distance < minimumD) {
                minimumD = distance;
            }
            i++;
        }
        return new int[] { minimumD, maximumD };
    }
}
