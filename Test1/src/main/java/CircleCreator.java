public class CircleCreator implements FigureCreator {
private String figureP;

    public CircleCreator(String figureP) {
        this.figureP = figureP;
    }

    @Override
    public Figure create() {


        Circle circle = new Circle(Double.valueOf(figureP));

        return null;
    }
}
