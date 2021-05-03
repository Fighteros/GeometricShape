package app;

public class Triangle extends GeometricShape{

    public Triangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double calcArea() {
        return getLength() * getWidth();
    }

    @Override
    public double calcPerimeter() {
        return (getLength() + getWidth()) * 2;
    }

    @Override
    public String toString() {
        return "Triangle{ " +
                "length" + getLength()+"width" + getWidth()+
                "}";
    }
}
