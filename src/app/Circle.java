package app;

public class Circle extends GeometricShape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "and radii"+ radius ;
    }
}
