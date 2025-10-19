public class TriangleCreator implements FigureCreator{
    private String figureP;

    public TriangleCreator(String figureP) {
        this.figureP = figureP;
    }

    @Override
    public Figure create() {
        String[] recParametr = figureP.split(" ");
        Double ab = Double.valueOf(recParametr[0]);
        Double bc = Double.valueOf(recParametr[1]);
        Double cd = Double.valueOf(recParametr[2]);
        return new Triangle(ab, bc, cd);

    }
}
