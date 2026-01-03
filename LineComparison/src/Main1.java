public class Main1 {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Program - UC4");

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        Point p3 = new Point(0, 0);
        Point p4 = new Point(6, 8);

        LineComparison line1 = new LineComparison(p1, p2);
        LineComparison line2 = new LineComparison(p3, p4);

        System.out.println("Length of Line 1: " + line1.calculateLength());
        System.out.println("Length of Line 2: " + line2.calculateLength());

        if (line1.isEqual(line2)) {
            System.out.println("Both lines are Equal");
        } else {
            int result = line1.compare(line2);

            if (result < 0)
                System.out.println("Line 1 is Smaller than Line 2");
            else
                System.out.println("Line 1 is Greater than Line 2");
        }
    }
}
