import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]); // sort by start
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] last = res.get(res.size()-1);
            if (intervals[i][0] <= last[1]) { // overlap
                last[1] = Math.max(last[1], intervals[i][1]); // merge
            } else {
                res.add(intervals[i]); // no overlap
            }
        }

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merged = merge(intervals);

        for (int[] inter : merged)
            System.out.println(Arrays.toString(inter));
    }
}