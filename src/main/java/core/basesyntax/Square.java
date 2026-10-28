package core.basesyntax;

public class Square extends Figure {

    private static final int QUANTITY_SIDE = 4;
    private double side = 10.0;

    public Square() {
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * QUANTITY_SIDE;
    }
}
