package homework.work2.libary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class FileReader {
    private final String path;

    public FileReader(String path) {
        this.path = path;
    }

    public Library reafFail() {
        Library  library = new Library();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(path))) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return library;
    }

}
