public class L_725 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode arr[] = new ListNode[k];

        ListNode temp = head;
        int total = 0;
        while (temp != null) {
            total++;
            temp = temp.next;
        }

        int size = total / k;
        int extra = total % k;

        temp = head;
        for (int i = 0; i < k; i++) {
            ListNode partHead = temp;
            int currentPartSize = size + (i < extra ? 1 : 0);

            for (int j = 1; j < currentPartSize && temp != null; j++) {
                temp = temp.next;
            }

            if (temp != null) {
                ListNode nextPart = temp.next;
                temp.next = null;
                temp = nextPart;
            }

            arr[i] = partHead;
        }

        return arr;
    }
}
