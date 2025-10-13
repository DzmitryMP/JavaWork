import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void test3() {
        FileInputStream file = null;

        try {

            File fileObdject = new File("C:/DEV/Test4.txt");
            file = new FileInputStream(fileObdject);
        } catch (FileNotFoundException e) {
            System.out.println("не нашли файл " + e.getMessage());
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                System.out.println("что то пошло не так " + e.getMessage());
            }
        }
    }

    public static void test4() {
        File fileObdject = new File("C:/DEV/Test4.txt");


        try (FileInputStream file = new FileInputStream(fileObdject)) {
        int sim;
            while ((sim = file.read())!= -1){
                System.out.print((char) sim) ;
            }
        } catch (IOException e) {
            System.out.println("что то пошло не так " + e.getMessage());
            throw new TestReException("Что то пошло не так", e);
        }
    }

}
