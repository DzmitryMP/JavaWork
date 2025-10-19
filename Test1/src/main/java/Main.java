import singleton.SingletonSample;

import java.util.List;

public class Main {
    public static void main(String[] args) {
FileReader fileReader = new FileReader("C:\\DEV\\REP\\JavaWork\\Test1\\src\\main\\resoursrs\\test.txt");


        List<Figure> figureList = fileReader.reafFail();
        for (Figure figure : figureList)
        {
            figure.print();
        }

        SingletonSample singletonSample = SingletonSample.CreateSingletonSample();
        SingletonSample singletonSample2 = SingletonSample.CreateSingletonSample();

    }
}
