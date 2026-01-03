public class Main1 {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Program - UC3");

        LineComparison line1 = new LineComparison(0, 0, 3, 4);
        LineComparison line2 = new LineComparison(0, 0, 6, 8);

        Double length1 = line1.calculateLength();
        Double length2 = line2.calculateLength();

        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        int result = line1.compare(line2);

        if (result == 0) {
            System.out.println("Both lines are Equal");
        } else if (result < 0) {
            System.out.println("Line 1 is Smaller than Line 2");
        } else {
            System.out.println("Line 1 is Greater than Line 2");
        }
    }
}
