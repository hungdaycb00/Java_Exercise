package Lession_17;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed, ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] results = new float[2];
        results[0] = this.getxSpeed();
        results[1] = this.getySpeed();
        return results;
    }

    public String toString() {
        return Arrays.toString(super.getXY()) + ", speed = " + "(" + this.getxSpeed() + "," + this.getySpeed() + ")";

    }

    public MovablePoint Move(){
        super.setXY(super.getX() + xSpeed, super.getY() + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint mv1 = new MovablePoint();
        System.out.println(mv1);
        MovablePoint mv2 = new MovablePoint(12.2f,12.8f,89,9);
        System.out.println(mv2);
        mv2.setSpeed(10.2f, 9.5f);
        System.out.println(mv2);
        mv2.Move();
        System.out.println(mv2);
    }


}
