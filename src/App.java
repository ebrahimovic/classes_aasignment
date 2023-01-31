import Circle.Circle;
import Cylinder.Cylinder;

public class App {
    public static void main(String[] args) throws Exception {

        Circle myCircle = new Circle(10);
        
        System.out.println("Area of Circle : " + myCircle.getArea());
        System.out.println("Perimeter of Circle : " + myCircle.getPerimeter());


        Cylinder myCylinder = new Cylinder(10, 3);

        System.out.println("Volume of Cylender : " + myCylinder.getVolume());

    }
}
