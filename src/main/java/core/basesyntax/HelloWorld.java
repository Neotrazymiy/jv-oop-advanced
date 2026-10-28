package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {

    private static String space = "";
    private static String cm = " cm,";
    private static String sideA = " sideA: ";
    private static String sideB = " sideB: ";
    private static String sideC = " sideC: ";
    private static String radius = " radius: ";
    private static String figureInfo = "Figure: %s, area: %.1f cm², perimetr: %.1f,"
            + "%s%s%s%s%s%%s%s%s%s%s%s color: %s";

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int i = 0; i < figures.length; i++) {
            if (i > 2) {
                if (figures[i] instanceof Circle circle) {
                    System.out.printf((figureInfo) + "%n",
                            circle.getClass().getSimpleName().toLowerCase(), circle.getArea(),
                            circle.getPerimeter(), space, space, space, space, space, space, space,
                            space, space, radius, String.valueOf(circle.getRadius()), cm,
                            circle.getColor());
                }
                if (figures[i] instanceof Square square) {
                    System.out.printf((figureInfo) + "%n",
                            square.getClass().getSimpleName().toLowerCase(), square.getArea(),
                            square.getPerimeter(), sideA, String.valueOf(square.getSide()), cm,
                            space, space, space, space, space, space, space, space, space,
                            square.getColor());
                }
            } else {
                if (figures[i] instanceof Rectangle rectangle) {
                    System.out.printf((figureInfo) + "%n",
                            rectangle.getClass().getSimpleName().toLowerCase(), rectangle.getArea(),
                            rectangle.getPerimeter(), sideA, String.valueOf(rectangle.getSideA()),
                            cm, sideB, String.valueOf(rectangle.getSideB()), cm, sideC,
                            String.valueOf(rectangle.getSideC()), cm, space, space, space,
                            rectangle.getColor());
                }
                if (figures[i] instanceof RightTriangle rightTriangle) {
                    System.out.printf((figureInfo) + "%n",
                            rightTriangle.getClass().getSimpleName().toLowerCase(),
                            rightTriangle.getArea(), rightTriangle.getPerimeter(), sideA,
                            String.valueOf(rightTriangle.getSide()), cm, space, space, space, space,
                            space, space, space, space, space, rightTriangle.getColor());
                }
                if (figures[i] instanceof IsoscelesTrapezoid isoscelesTrapezoid) {
                    System.out.printf((figureInfo) + "%n",
                            isoscelesTrapezoid.getClass().getSimpleName().toLowerCase(),
                            isoscelesTrapezoid.getArea(), isoscelesTrapezoid.getPerimeter(), sideA,
                            String.valueOf(isoscelesTrapezoid.getSideBaseA()), cm, sideB,
                            String.valueOf(isoscelesTrapezoid.getSideBaseB()), cm, sideC,
                            String.valueOf(isoscelesTrapezoid.getSideC()), cm, space, space, space,
                            isoscelesTrapezoid.getColor());
                }
            }
        }
    }
}
