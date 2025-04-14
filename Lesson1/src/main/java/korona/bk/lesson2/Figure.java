package korona.bk.lesson2;

public abstract class Figure {

    public final double square;

    protected Figure(double square) {
        this.square = square;
    }


    public abstract void print();

    public abstract FigureType getType();

}
