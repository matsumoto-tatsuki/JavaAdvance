package oop2;

public class Triangle  implements Shape{
    double bottom;
    double height;

    public Triangle(double bottom, double height){
        this.bottom = bottom;
        this.height = height;
    }
    @Override
    public double calculateArea(){
        return (bottom * height) / 2;
    }
}
