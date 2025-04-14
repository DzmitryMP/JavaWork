package korona.bk.lesson2;

public class Circle extends Figure{

    private final double radius;

    public  Circle(double radius){
        super(radius);
        this.radius = radius;

    }

    public  Circle(int diametr){

        super( diametr/2);
        this.radius = diametr/2;
    }

    @Override
    public void print() {
        System.out.println("Нариcовали круг");
    }

    @Override
    public FigureType getType() {
        return FigureType.CIRCLE;
    }

    public void roll(){
        System.out.println("Круг катится");
    }



}
