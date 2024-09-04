

public class Rhombus extends Shape {

    private double side;
    private double width;
    private double height;

    public Rhombus(double side, double width, double height) {
        this.side = side;
        this.width = width;
        this.height = height;
    }

    public double getside() {
        return 0;
    }

    public void setside(double side) {
        this.side = side;
    }

    public double getwidth() {
        return 0;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public double getheight() {
        return 0;
    }

    public void setheight(double height) {
        this.height = height;
    }

    @Override
    double getArea() {
        return 4 * side;
    }

    @Override
    double getParemiter() {
        return (width * height) / 2;
    }

}