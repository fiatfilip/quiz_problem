package ro.siit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.max.CouldNotReadCoreException;

public class ShapesTest {
    @Test
    public void perimeterSumWorks() throws Exception {
        Shapes shapes = new Shapes();
        Triangle triangle1 = new Triangle(3,4,5);
        Triangle triangle2 = new Triangle(6,7,9);

        shapes.addShape(triangle1);
        shapes.addShape(triangle2);

        Assert.assertEquals(34.0, shapes.getTotalPerimeter(), 0);
    }

    @Test(expected = Exception.class)
    public void throwsExceptionWhenAddingSimilarShapes() throws Exception{
        Shapes shapes = new Shapes();
        Circle circle1  = new Circle(1);
        Circle circle2  = new Circle(1);

        shapes.addShape(circle1);
        shapes.addShape(circle2);
    }

    @Test
    public void calculusOnSQuaresWorks() throws Exception {
        Shapes shapes = new Shapes();
        Square square = new Square(2);

        shapes.addShape(square);

        Assert.assertEquals(8, shapes.getTotalPerimeter(), 0);
    }
}
