import java.util.ArrayList;
import java.util.List;

class Drawing implements Shape
{
    List<Shape> list= new ArrayList<>();

    @Override
    public void draw(String color) {
        for (Shape s: list)
        {
            s.draw("Blue");
        }
    }
}
