package Lession16_2;

import javax.sound.sampled.Line;
import java.security.PublicKey;

public class LineSub extends Point{
    Point end;
    //constructor
    public LineSub(int x1, int y1, int x2, int y2){
        super(x1, y1);
        this.end = new Point(x2, y2);
    }
    public LineSub(Point begin, Point end){
        super(begin.getX(), begin.getY());
        this.end = end;
    }

}
