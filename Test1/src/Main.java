public class Main {
    public static void main(String[] args){
        try {


            Test2.test4();

        } catch (ArithmeticException e) {
            System.out.println("Делить на 0 нельзя " );
            System.out.println(e.getMessage());

        }
        /*catch (TestException e){
            System.out.println(e.getMessage());
        }*/
    }
}
