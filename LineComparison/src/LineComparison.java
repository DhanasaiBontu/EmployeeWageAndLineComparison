public class LineComparison {

    private int x1, y1, x2, y2;

    // Constructor
    public LineComparison(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Calculate length of line
    public Double calculateLength() {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );
    }

    // Check equality using equals()
    public boolean isEqual(LineComparison otherLine) {
        return this.calculateLength().equals(otherLine.calculateLength());
    }

    public int compare(LineComparison otherLine) {
        return this.calculateLength().compareTo(otherLine.calculateLength());
    }

}
