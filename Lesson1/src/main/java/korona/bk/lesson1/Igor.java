package korona.bk.lesson1;

public class Igor {

   public static final String NAME = "Игорь";
   public final double height;
   public final String lastName;

   public Igor (double height, String lastName){

       this.height = height;
       this.lastName = lastName;
   }

   public void jump(int heightJump){

       System.out.println(NAME + " " + lastName + " Подпрыгнул на высоту " + heightJump);
   }

   public void sleep(){
       System.out.println(NAME + " " + lastName + " спит");
   }
}
