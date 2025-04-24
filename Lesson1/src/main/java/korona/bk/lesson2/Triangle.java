package korona.bk.lesson2;

public class Triangle implements FigureInterface{


    @Override
    public String print() {
        return "Нарисован треугольник";
    }

    @Override
    public double getSquare() {
        return 0;
    }

    @Override
    public FigureType getType() {
        return null;
    }
}
