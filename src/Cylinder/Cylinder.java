package Cylinder;

public class Cylinder {
    public double radius;
    public double height;


    public Cylinder(double radius, double height){
        this.radius =radius;
        this.height = height;
    }

 public double getVolume(){
    double v= Math.PI * (this.radius*this.radius)* this.height;
    return v;
}
 }
