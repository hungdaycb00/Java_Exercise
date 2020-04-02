package Lession_20.Abstract.Interface_Movable;

import Lession_19.Monster.Monster;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y +=ySpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }
}
