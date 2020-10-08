package ro.siit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shapes {
    // Set<Shape> shapes = new HashSet<>();
    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) throws Exception{
        if(shapes.contains(shape)){
            throw new Exception("Cannot add similar " + shape.getClass().getName());
        }
        this.shapes.add(shape);
    }

    public double getTotalPerimeter(){

        double sum = 0;
        for (Shape shape: shapes) {
            sum += shape.getPerimeter();
        }

        return shapes.stream()
                .mapToDouble(shape -> shape.getPerimeter())
                .reduce(0, (x, y) -> x + y);
    }

    public double getTotalArea(){
        return shapes.stream()
                .mapToDouble(shape -> shape.getArea())
                .reduce(0, (x, y) -> x + y);
    }
}
