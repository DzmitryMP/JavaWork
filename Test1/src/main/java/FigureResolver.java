import java.util.HashMap;
import java.util.Map;

public class FigureResolver {
    private final Map<FigureType, FigureCreator> hashMap = new HashMap<>();

    public FigureResolver() {
        hashMap.put(FigureType.CIRCLE, new CircleCreator());
        hashMap.put(FigureType.RECTANGLE, new RectangleCreator());
        hashMap.put(FigureType.TRIANGLE, new TriangleCreator());
    }

    public FigureCreator getFigureCreator(FigureType figureType) {
        return hashMap.get(figureType);
    }
}
