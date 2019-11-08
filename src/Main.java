import zadanie2.Interval;
import zadanie2.Zadanie2;

public class Main {

    public static void main(String[] args) {

//        Interval arr[]=new Interval[5];
//        arr[0] = new Interval(2,6);
//        arr[1] = new Interval(8,10);
//        arr[2] = new Interval(1,3);
//        arr[3] = new Interval(15,18);
//        arr[4] = new Interval(18,21);

        Interval array[] = new Interval[6];
        array[0] = new Interval(2,6);
        array[1] = new Interval(8,10);
        array[2] = new Interval(1,3);
        array[3] = new Interval(15,18);
        array[4] = new Interval(18,21);
        array[5] = new Interval(3,11);

        Zadanie2 zad2 = new Zadanie2();
        zad2.mergeIntervals(array);


    }


}
