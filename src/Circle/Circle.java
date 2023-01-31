package Circle;

import java.lang.Math;

public class Circle {
    public double radius;
    public double diameter;

    public Circle(){}

    public Circle(double radius){
        this.radius =radius;
    }

 public double getArea(){
    double area= Math.PI * (this.radius*this.radius);
    return area;
 }
 public double getPerimeter(){
    double perimeter = Math.PI * (this.radius*0.5);
    return perimeter;

 }
}