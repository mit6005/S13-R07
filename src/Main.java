import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Point origin = new Point(0, 0);
        Point oneZero = new Point(1, 0);
        Point zeroOne = new Point(0, 1);
        Point oneOne = new Point(1, 1);
        
        TreeSet<Point> ts = new TreeSet<Point>();
        ts.add(origin);
        ts.add(oneZero);
        ts.add(zeroOne);
        ts.add(oneOne);
        
        for (Point p : ts) {
            System.out.println(p);
        }
    }
}
