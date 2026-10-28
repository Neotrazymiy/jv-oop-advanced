package core.basesyntax;

public class FigureSupplier extends ColorSupplier {

    private static final double NUMBER = 100.0;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{
                new Circle(colorSupplier.getRandomColor(), ColorSupplier.RANDOM.nextDouble(NUMBER)),
                new Square(colorSupplier.getRandomColor(), ColorSupplier.RANDOM.nextDouble(NUMBER)),
                new Rectangle(colorSupplier.getRandomColor(),
                        ColorSupplier.RANDOM.nextDouble(NUMBER),
                        ColorSupplier.RANDOM.nextDouble(NUMBER),
                        ColorSupplier.RANDOM.nextDouble(NUMBER)),
                new RightTriangle(colorSupplier.getRandomColor(),
                        ColorSupplier.RANDOM.nextDouble(NUMBER)),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        ColorSupplier.RANDOM.nextDouble(NUMBER),
                        ColorSupplier.RANDOM.nextDouble(NUMBER),
                        ColorSupplier.RANDOM.nextDouble(NUMBER))};
        return figures[ColorSupplier.RANDOM.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        Figure[] figures = new Figure[]{new Circle(), new Square()};
        return figures[ColorSupplier.RANDOM.nextInt(figures.length)];
    }

}
