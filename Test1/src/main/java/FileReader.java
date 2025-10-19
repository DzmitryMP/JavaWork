import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private final String path;

    public FileReader(String path) {
        this.path = path;
    }

    public List<Figure> reafFail() {
        List<Figure> figureList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(path))) {
            String figureT;
            String figureP;
            while ((figureT = reader.readLine()) != null) {
                FigureType figureType = FigureType.valueOf(figureT);
                figureP = reader.readLine();

                FigureCreator figureCreator = null;

                if (figureType.equals(FigureType.CIRCLE)) {

                    figureList.add(circle);
                }

                if (figureType.equals(FigureType.RECTANGLE)) {
                    figureCreator = new RectangleCreator(figureP);

                    figureList.add(rectangle);
                }

                if (figureType.equals(FigureType.TRIANGLE)) {
                    figureCreator = new TriangleCreator(figureP);
                    String[] recParametr = figureP.split(" ");
                    Double ab = Double.valueOf(recParametr[0]);
                    Double bc = Double.valueOf(recParametr[1]);
                    Double cd = Double.valueOf(recParametr[2]);
                    Triangle triangle = new Triangle(ab, bc, cd);
                    figureList.add(triangle);
                }
                figureList.add(figureCreator.create());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return figureList;
    }
}
