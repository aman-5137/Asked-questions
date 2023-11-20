interface Shape{
    void getArea();
}
class Rectangle implements Shape{
    @Override
    public void getArea() {
        System.out.println("Area of rectangle.");
    }
}
class Circle implements Shape{
    @Override
    public void getArea() {
        System.out.println("Area of Circle. ");
    }
}
class Triangle implements Shape{
    @Override
    public void getArea() {
        System.out.println("Area of Triangle. ");
    }
}



public class shapes_interface {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        obj1.getArea();

        Circle obj2 = new Circle();
        obj2.getArea();

        Triangle obj3 = new Triangle();
        obj3.getArea();
    }
}
