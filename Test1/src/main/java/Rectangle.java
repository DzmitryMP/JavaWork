public class Rectangle implements Figure  {
    private  final Double length;
    private  final Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double getPerimeter() {
        return (length+width) * 2;
    }

    @Override
    public String getName() {
        return FigureType.RECTANGLE.toString();
    }

    @Override
    public Double getSquare() {
        return length * width;

    }
    public Double getDiaganal(){
        return Math.sqrt((length * length) + (width * width));
    }

    public void print (){
        System.out.println("Длинна диоганали " + getDiaganal() + " Размер длинной стороны" +  length + " размер котроткой староны " + width);
    }
}
