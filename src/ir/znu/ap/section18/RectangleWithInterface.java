package src.ir.znu.ap.section18;

public class RectangleWithInterface implements AreaGetterInterface,Comparable<RectangleWithInterface> {

    private int w;
    private int l;

    public RectangleWithInterface(int w, int l) {
        this.w = w;
        this.l = l;
    }

    @Override
    public double getArea() {
        return this.l * this.w;
    }

    @Override
    public int compareTo(RectangleWithInterface o) {
        return 0;
    }
}
