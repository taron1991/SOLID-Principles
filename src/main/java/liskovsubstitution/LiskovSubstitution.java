package liskovsubstitution;

/**
 * третий принцип SOLID гласит: поведение методов в дочернем классе должно следовать принципам базового класса,
 * а не изменять их
 */
public class LiskovSubstitution {
    static Rectangle getRectangle() {
        return new Rectangle();
    }

    public static void main(String[] args) {
        Rectangle rectangle = getRectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        System.out.println(rectangle.getSquare());
    }
}
interface Shape{
    int getSquare();
}
class Rectangle implements Shape{
    public int height;
    public int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSquare() {
        return width * height;
    }
}

class Square implements Shape {

    int width;

    @Override
    public int getSquare() {
        return width*width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}