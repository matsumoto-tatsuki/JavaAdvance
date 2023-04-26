package oop2;

public class ShapeTest {

    public static double getTotalArea(Shape[] shapes){
        double sum = 0;
        for(var shape:shapes){
            sum += shape.calculateArea();
        }
        return sum;
    }
    public static void main(String[] args){
        Shape[] shapes = {
                new Triangle(5,2),
                new Rectangle(5,2),
                new Circle(2)
        };
        System.out.println(getTotalArea(shapes));
    }
}
