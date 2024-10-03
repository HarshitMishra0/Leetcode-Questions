import java.util.ArrayList;
import java.util.List;

public class L_731 {
    private List<int[]> calendar;
    private List<int[]> overlaps;

    public MyCalendarTwo() {
        calendar = new ArrayList<>();
        overlaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] event : overlaps) {
            if (Math.max(start, event[0]) < Math.min(end, event[1])) {
                return false;
            }
        }

        for (int[] event : calendar) {
            int overlapStart = Math.max(start, event[0]);
            int overlapEnd = Math.min(end, event[1]);

            if (overlapStart < overlapEnd) {
                overlaps.add(new int[] { overlapStart, overlapEnd });
            }
        }
        calendar.add(new int[] { start, end });
        return true;
    }
}
