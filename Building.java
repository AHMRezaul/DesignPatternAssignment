import java.util.ArrayList;
import java.util.List;

public class Building implements Shape{

    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void build(String buildShape) {
        for(Shape shape : shapes){
            shape.build(buildShape);
        }
    }

    public void add(Shape shape){
        this.shapes.add(shape);
    }
}