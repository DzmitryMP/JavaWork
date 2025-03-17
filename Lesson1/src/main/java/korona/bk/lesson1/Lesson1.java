package korona.bk.lesson1;

public class Lesson1 {
    int[] array = new int[5] ;
    public static void main(String[] args) {
        System.out.println("Спасибо Олег");
        String name = Igor.NAME;
        Igor igor1 = new Igor(158, "Малиновский");
        Igor igor2 = new Igor(156, "Терехов");
        igor1.jump(2);
        igor2.jump(3);
        igor1.sleep();
        igor2.sleep();

        int[] intMas = {12, 6, 4, 1, 15, 10};
        Sort sort = new Sort();
        sort.sort(intMas);

        //отсартировать масив целых чисел не создавая новыый массив
        //для типа чар сделать тоже самое но в двумерном масиве можно создавать новый
        //две разные программы запускаться из метода мейн
        //результаты вывести в консоль

    }
}
