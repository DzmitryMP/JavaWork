package korona.bk.lesson2;

public class Circle implements Rollable, FigureInterface {

    private final double radius;
    private final double square;

    public  Circle(double radius){
        this.square = radius;
        this.radius = radius;

    }

    @Override
    public double getSquare() {
        return square;
    }

    public  Circle(int diametr){
 //    square = diametr:
   //     super( diametr/2);
        this.square = diametr/2;
        this.radius = diametr/2;
    }

   /* @Override
    public String print() {
        System.out.println("Нариcовали круг");
    }

    @Override
    public FigureType getType() {
        return FigureType.CIRCLE;
    }
*/
   @Override
    public void roll(){
        System.out.println("Круг катится");
    }


    @Override
    public String print() {
        return "Нариcовали круг";
    }

    @Override
    public FigureType getType() {
        return FigureType.CIRCLE;
    }
}
