package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double sideBaseA;
    private double sideBaseB;
    private double sideC;

    public IsoscelesTrapezoid(String color, double sideBaseA, double sideBaseB, double sideC) {
        super(color);
        this.sideBaseA = sideBaseA;
        this.sideBaseB = sideBaseB;
        this.sideC = sideC;
    }

    public double getSideBaseA() {
        return sideBaseA;
    }

    public void setSideBaseA(double sideBaseA) {
        this.sideBaseA = sideBaseA;
    }

    public double getSideBaseB() {
        return sideBaseB;
    }

    public void setSideBaseB(double sideBaseB) {
        this.sideBaseB = sideBaseB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return (sideBaseA + sideBaseB) / 2 * getHeight();
    }

    @Override
    public double getPerimeter() {
        return sideC * 2 + sideBaseA + sideBaseB;
    }

    @Override
    public double getHeight() {
        return Math.sqrt(Math.pow(sideC, 2) - Math.pow((sideBaseB - sideBaseA) / 2, 2));
    }
}
