import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private final String path;
    private final FigureResolver fileReader = new FigureResolver();

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
                FigureCreator figureCreator = fileReader.getFigureCreator(figureType);
                figureList.add(figureCreator.create(figureP));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return figureList;
    }


}
