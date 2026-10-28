package core.basesyntax;

public class Circle extends Figure {

    private static final double PI = Math.PI;
    private double radius = 10.0;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiametr() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return PI * radius;
    }
}
