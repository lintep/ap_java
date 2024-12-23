package src.ir.znu.ap.section10;

import src.myproject.stringutil.Point;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getPerimeter() {
//        double distanceAB =a.distance(b);
//        double distanceBC =b.distance(c);
//        double distanceAC =a.distance(c);
//        double perimeter=distanceAB+distanceAC+distanceBC;
//        return perimeter;
        return a.distance(b)+b.distance(c)+a.distance(c);
    }

    public void printPerimeter() {
        System.out.println("Perimeter: "+this.getPerimeter());
    }
}
