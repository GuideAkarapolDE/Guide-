
public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;
    private double width;
    private double height;

    public Triangle(double side1, double side2, double side3, double width, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.width = width;
        this.height = height;
    }

    public double getside1() {
        return 0;
    }

    public void setside1(double side1) {
        this.side1 = side1;
    }

    public double getside2() {
        return 0;
    }

    public void setside2(double side2) {
        this.side2 = side2;
    }

    public double getside3() {
        return 0;
    }

    public void setside3(double side3) {
        this.side3 = side3;
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
        return (width * height) / 2;
    }

    @Override
    double getParemiter() {
        return side1 + side2 + side3;
    }
}
