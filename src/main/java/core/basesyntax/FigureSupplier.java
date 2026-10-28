package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        double number = 100.0;
        Figure[] figures = new Figure[]{
                new Circle(colorSupplier.getRandomColor(), random.nextDouble(number)),
                new Square(colorSupplier.getRandomColor(), random.nextDouble(number)),
                new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(number),
                        random.nextDouble(number)),
                new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(number), random.nextDouble(number)),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(number),
                        random.nextDouble(number),
                        random.nextDouble(number))};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        Figure[] figures = new Figure[]{new Circle()};
        return figures[random.nextInt(figures.length)];
    }

}
