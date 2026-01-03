public class Main1 {
    public static void main(String[] args) {

        LineComparison line = new LineComparison(2, 3, 5, 7);

        double length = line.calculateLength();

        System.out.println("Length of the line: " + length);
    }
}
