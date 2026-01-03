public class Main1 {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Program - UC2");

        // Line 1
        LineComparison line1 = new LineComparison(0, 0, 4, 4);

        // Line 2
        LineComparison line2 = new LineComparison(1, 1, 5, 5);

        Double length1 = line1.calculateLength();
        Double length2 = line2.calculateLength();

        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        if (line1.isEqual(line2)) {
            System.out.println("Both lines are Equal");
        } else {
            System.out.println("Lines are Not Equal");
        }
    }
}
