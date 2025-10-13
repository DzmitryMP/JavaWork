public class RectangleCreator implements FigureCreator {
    private String figureP;

    public RectangleCreator(String figureP) {
        this.figureP = figureP;
    }

    @Override
    public Figure create() {
        String[] recParametr = figureP.split(" ");
        Double length = Double.valueOf(recParametr[0]);
        Double width = Double.valueOf(recParametr[1]);

        new Rectangle(length, width);

    }
}
