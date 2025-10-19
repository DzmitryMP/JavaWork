public class CircleCreator implements FigureCreator {


    @Override
    public Figure create(String figureP) {
        return new Circle(Double.valueOf(figureP));

    }
}
