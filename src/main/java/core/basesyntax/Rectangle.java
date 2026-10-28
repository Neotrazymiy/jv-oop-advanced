package core.basesyntax;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;
    private double heightA;

    public Rectangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getHeightA() {
        return heightA;
    }

    public void setHeightA(double heightA) {
        this.heightA = heightA;
    }

    @Override
    public double getArea() {
        return Math.sqrt(
                getPerimeter() * (getPerimeter() - sideA) * (getPerimeter() - sideB) * (
                        getPerimeter()
                                - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getHeight() {
        return Math.sqrt(Math.pow(sideB, 2) - Math.pow(sideA / 2, 2));
    }
}
