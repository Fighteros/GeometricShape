package app;

public abstract class GeometricShape {

    private double length;

    private double width;

    public GeometricShape() {
    }

    public GeometricShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public abstract double calcArea() ;

    public abstract double calcPerimeter();

    @Override
    public String toString() {
        return "GeometricShape{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
