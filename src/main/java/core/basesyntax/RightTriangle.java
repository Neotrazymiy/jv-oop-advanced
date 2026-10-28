package core.basesyntax;

public class RightTriangle extends Figure {

    private static final int QUANTITY_SIDE = 3;
    private double side;

    public RightTriangle(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) / 2 * Math.pow(side, QUANTITY_SIDE - 1);
    }

    @Override
    public double getPerimeter() {
        return side * QUANTITY_SIDE;
    }

    @Override
    public double getHeight() {
        return Math.sqrt(3) / 4 * Math.pow(side, 2);
    }

}
