package src.ir.znu.ap.section18;

import src.ir.znu.ap.section10.Triangle;
import src.myproject.stringutil.Point;

public class RectangleExtend extends Point {

    private int w;
    private int l;


    private int c;
    public RectangleExtend(int w, int l, int pointX, int pointY) {
        super(pointX,pointY);
        this.w = w;
        this.l = l;
    }

    public RectangleExtend(int w, int l) {
        super();
        this.w = w;
        this.l = l;
    }


    @Override
    public String toString() {
        return "RectangleExtend{"+super.x+" w: " + w + ", l: " + l+"}";
    }

    public int getMyArea(){
        return w*l;
    }

    public int sum(int x, int y){
        return c*x+y;
    }
}
