package korona.bk.lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        Circle circle = new Circle(25.4);
        Figure figure = new Circle(25.4);
        circle.roll();
        circle.print();
        figure.print();
        Figure figure3 = new Rectangle(56);

        if (figure instanceof Circle) {
            Circle figure1 = (Circle) figure;
            figure1.roll();
            figure1.print();
        }
        if (figure instanceof Rectangle) {
            Rectangle figure2 = (Rectangle) figure;
            figure2.print();
        }
        Picture picture = new Picture("Вангог", circle);
        picture.print();
        Picture picture1 = new Picture("Игорь", figure3);
        picture1.print();

        System.out.println(CustomMonths.ЯНВАРЬ.getNumber());
        System.out.println(CustomMonths.ЯНВАРЬ.name());

    }
}
//1 мосив целых чисел заданное число, написать метод который ренет масив первый индекс найнедгого