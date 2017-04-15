import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by shekhar on 15/04/17.
 */
public class MergeIntervals {
    private static class Interval {
        int start;
        int end;

        Interval(int a, int b) {
            this.start = a;
            this.end = b;
        }

    }

    public static void main(String[] args) {
        List<Interval> intervals = new LinkedList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));

        List<Interval> result = new LinkedList<>();
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) {
                    return o1.start - o2.start;
                } else {
                    return o1.end - o2.end;
                }
            }
        });

        for (Interval interval : intervals) {
            System.out.println(interval.start + " " + interval.end);
        }

        System.out.println("***************");

        Interval pre = intervals.get(0);

        for (int i = 0; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (pre.end < curr.start) {
                result.add(pre);
                pre = curr;
            } else {
                Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
                pre = merged;
            }
        }
        result.add(pre);

        for (Interval interval : result) {
            System.out.println(interval.start + " " + interval.end);
        }
    }
}
