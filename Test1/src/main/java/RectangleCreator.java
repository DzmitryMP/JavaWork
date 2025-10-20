public class RectangleCreator implements FigureCreator {


    @Override
    public Figure create(String figureP) {
        String[] recParametr = figureP.split(" ");
        Double length = Double.valueOf(recParametr[0]);
        Double width = Double.valueOf(recParametr[1]);


return new Rectangle(length, width);    }
}
