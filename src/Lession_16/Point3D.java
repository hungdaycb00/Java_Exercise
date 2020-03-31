package Lession_16;

import org.w3c.dom.ls.LSOutput;

public class Point3D extends Point2D {
    private int z;
    //constructor
    public Point3D(){
        super();
        this.z = 0;
    }
    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    //getters and setters
    public int getZ(){
        return this.z;
    }
    public void setZ(int z){
        this.z = z;
    }
    public int[] getXYZ(){
        int[] results = new int[3];
        results[0] = this.getX();
        results[1] = this.getY();
        results[2] = this.getZ();
        return  results;
    }
    //return (x,y,z)
    public String toString(){
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }

}
