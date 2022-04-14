package AbstractClass;

import java.util.Arrays;

public class ComparableCircle extends Circle1
        implements Comparable<ComparableCircle> {
    public ComparableCircle() {

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }


    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}

class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(4);
        circles[1] = new ComparableCircle();
        circles[2]  = new ComparableCircle(3.2,"green", true);
        System.out.println("Pre-sorted");
        for (ComparableCircle circle :
                circles) {
            System.out.println(circle);
        }
        System.out.println("after-sorted");
        Arrays.sort(circles);
        for (ComparableCircle   circle :
             circles    ) {
            System.out.println(circle);
        }

    }
}

