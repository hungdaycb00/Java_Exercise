package Lession_17;

public class Point {
    private float x, y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] results = new float[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y +")";
    }
}
