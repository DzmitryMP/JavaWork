package korona.bk.lesson2;

public class Rectangle implements FigureInterface {

    private final double square;
    protected Rectangle(double square) {
        this.square = square;
    }

    @Override
    public double getSquare() {
        return square;
    }

    @Override
    public String print() {
        System.out.println("Нарисовали прямоугольник");
        return "Нарисовали прямоугольник";
    }

    @Override
    public FigureType getType() {
        return FigureType.RECTANGLE;
    }
}
