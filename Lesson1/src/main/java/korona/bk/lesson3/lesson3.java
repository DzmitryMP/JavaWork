package korona.bk.lesson3;

public class lesson3 {
    public static void main(String[] args) {

        Tree tree1 = new Tree(100, "березка", 1.5);
        Tree tree2 = new Tree(100, "березка", 1.5);

        System.out.println("tree1 == tree1 :" + (tree1 == tree2));
        System.out.println("tree1.equals tree1 :" + (tree1.equals(tree2)));

        //System.out.println("tree1.toString() == tree1.toString() :" + tree1.toString() + " "+ tree2.toString() + " "+ (tree1.toString() == tree2.toString()));
        System.out.println("tree1.toString() == tree1.toString() :" + tree1.toString() + " "+ tree2.toString());



        Berezka berezka = new Berezka();
        berezka.setAge(5);
        berezka.setName("Вадим");
        berezka.setHeight(15.2);
        System.out.println(berezka.getType() + " " + berezka.toString());


    /*    System.out.println("tree1.name  == tree1.name  :" + (tree1.name == tree2.name));
        System.out.println("tree1.age  == tree1.age  :" + (tree1.age == tree2.age));
        System.out.println("tree1.height  == tree1.height  :" + (tree1.height == tree2.height));*/

   //  Converter converter = new  Converter();
     //   Converter.ConverterIntToInteger(5);
    }



}
