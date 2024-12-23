package src.ir.znu.ap.section15;

public class Rectangle extends Shape{
    private double w;
    private double l;

    public Rectangle(double w, double l) {
        this.w = w;
        this.l = l;
    }

    @Override
    public double getArea() {
        return this.l * this.w;
    }

    public boolean isSquare(){
//        boolean result;
//        if(this.w==this.l)
//            result=true;
//        else
//            result=false;
//        return result;

//        if(this.w==this.l)
//            return true;
//        else
//            return false;

        return this.w==this.l;
    }
}
