package src.ir.znu.ap.section15;

public class Circle extends Shape{
    private double r;

    public Circle(double r){
        this.r=r;
    }

    @Override
    public double getArea() {
        double area = Math.PI * this.r * this.r;
        return Math.round(area*100)/100.0;
    }
}
