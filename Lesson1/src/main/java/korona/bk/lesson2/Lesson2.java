package korona.bk.lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        Circle circle = new Circle(25.4);
        FigureInterface figure = new Circle(25.4);
        circle.roll();
        circle.print();
        figure.print();
        FigureInterface figure3 = new Rectangle(56);

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

        Roller roller = new Roller();
        Printer printer = new Printer();
        roller.roll(circle);
        printer.print(circle);

    }
}
//1 мосив целых чисел заданное число, написать метод который ренет масив первый индекс найнедгого
//1создать клас принтер  - с единстрвенным методом принт
//внутри будет
// создать клас кототель рллер метод рол интерфейс ролаббл
//


