package korona.bk.lesson2;

public class Rectangle extends Figure{
    protected Rectangle(double square) {
        super(square);
    }

    @Override
    public void print() {
        System.out.println("Нарисовали прямоугольник");
    }

    @Override
    public FigureType getType() {
        return FigureType.RECTANGLE;
    }
}
