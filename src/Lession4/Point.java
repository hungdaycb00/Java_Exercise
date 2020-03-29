package Lession4;

public class Point {
    private int x, y;

    //The constructor
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //The public getters and setters
    public int getX(){
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //return (x, y)
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    //return a 2-element int array containing x and y
    public int[] getXY(){
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    //set both x and y.
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    //return the distance from this instance to the given point at(x, y)
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    //return the distance from this intance to (0,0)
    public double distance(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    //return the distance
    public double distance(Point another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}
