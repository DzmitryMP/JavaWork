public class Circle implements Figure {

    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;

    }

    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return FigureType.CIRCLE.toString();
    }

    @Override
    public Double getSquare() {
        return Math.PI * radius * radius;
    }

    public void print(){

        System.out.println("Радиус");
    }
}
