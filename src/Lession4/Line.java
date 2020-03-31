package Lession4;

import java.awt.*;

public class Line {
    private Point begin, end;
    public Line(int x1, int y1, int x2, int y2){
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }
    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }

    //setter and getter
    public Point getBegin(){
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public  Point getEnd(){
        return end;
    }
    public void setEnd(Point end){
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int[] getBeginXY(){
        return begin.getXY();
    }
    public void setBeginXY(int x1, int y1){
        begin.setXY(x1,y1);
    }
    public int[] getEndXY(){
        return end.getXY();
    }
    public void setEndXY(int x2, int y2){
        end.setXY(x2,y2);
    }
    //return
    public String toString(){
        return String.format("Line[begin=%s, end=%s]",begin,end);
    }
    public double getLength(){
        return begin.distance(end);
    }

}
