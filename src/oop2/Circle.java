package oop2;

public class Circle implements Shape {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.round(radius * radius * Math.PI);
    }
}
