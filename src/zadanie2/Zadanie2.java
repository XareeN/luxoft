package zadanie2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Zadanie2 {

    public static void mergeIntervals(Interval intervals[]) {
        if (intervals.length <= 0)
            return;

        Stack<Interval> stack = new Stack<>();
        Stack<Interval> stackReversed = new Stack<>();

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        stack.push(intervals[0]);

        for (int i = 1; i < intervals.length; i++){

            Interval top = stack.peek();

            if (top.end < intervals[i].start){
                stack.push(intervals[i]);

            }else if (top.end < intervals[i].end){
                top.end = intervals[i].end;
                stack.pop();
                stack.push(top);
            }
        }

        while (!stack.isEmpty()){
            stackReversed.push(stack.pop());
        }
        System.out.println("\n-------------------------");
        System.out.println("Wynik zadania 2:");
        while (!stackReversed.isEmpty()){
            Interval result = stackReversed.pop();
            System.out.print("[" + result.start + "," + result.end + "] ");
        }
        System.out.println("\n-------------------------");
    }
}
