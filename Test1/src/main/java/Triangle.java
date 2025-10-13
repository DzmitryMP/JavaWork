public class Triangle implements Figure {

    private final Double ab;
    private final Double bc;
    private final Double ca;

    public Triangle(Double ab, Double bc, Double ca) {
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
    }

    @Override
    public Double getPerimeter() {
        return ab+  bc+ ca;
    }

    @Override
    public String getName() {
        return FigureType.TRIANGLE.toString();
    }


    @Override
    public Double getSquare() {
        double poluPer = getPerimeter() / 2;
        return Math.sqrt(poluPer * (poluPer - ab)* (poluPer - bc)* (poluPer*ca));
    }

    public void print () {
        System.out.println("Длинна стороны аb: " + ab + "Длинна стороны bc: " + bc + "Длинна стороны ca: " + ca);
    }
}
