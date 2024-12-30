package src.ir.znu.ap.section18;

import src.ir.znu.ap.section10.Triangle;
import src.myproject.stringutil.Point;

public class RectangleComposite {

    private Point point;
    private Triangle triangle;
    private int w;
    private int l;

    public RectangleComposite(int w, int l, int pointX, int pointY) {
        point = new Point(pointX,pointY);
        this.w = w;
        this.l = l;
    }

    public RectangleComposite(int w, int l) {
        point = new Point();
        this.w = w;
        this.l = l;
    }

    @Override
    public String toString() {
        return "RectangleComposite{" +
//                "point=" + point +
                "point=" + point.getX() +
                ", w=" + w +
                ", l=" + l +
                '}';
    }

    public double getAllArea(){
        return w*l;
    }

}
