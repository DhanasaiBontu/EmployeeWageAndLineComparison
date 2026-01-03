public class LineComparison {

    private Point p1;
    private Point p2;

    public LineComparison(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Double calculateLength() {
        return Math.sqrt(
                Math.pow(p2.x - p1.x, 2) +
                        Math.pow(p2.y - p1.y, 2)
        );
    }

    public boolean isEqual(LineComparison otherLine) {
        return this.calculateLength().equals(otherLine.calculateLength());
    }

    public int compare(LineComparison otherLine) {
        return this.calculateLength().compareTo(otherLine.calculateLength());
    }
}
