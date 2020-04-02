package Lession_20.Abstract.Interfaces_GeometricObject;

public class ResiableCircle extends Circle implements Resizable{
    public ResiableCircle(double radius){
        super(radius);
    }


    public double resize(int percent) {
        radius *= percent*0.01;
        return radius;
    }
}
