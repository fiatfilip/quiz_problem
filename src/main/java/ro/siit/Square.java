package ro.siit;

public class Square implements Shape{
    private Rectangle backupRectangle;

    public Square(double edge) {
        this.backupRectangle = new Rectangle(edge, edge);
    }

    @Override
    public double getArea() {
        return backupRectangle.getArea();
    }

    @Override
    public double getPerimeter() {
        return backupRectangle.getPerimeter();
    }
}
