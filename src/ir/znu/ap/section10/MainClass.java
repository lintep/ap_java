package src.ir.znu.ap.section10;

import myproject.stringutil.Point;

import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        Point pointA=new Point(2,4);
        Point pointB=new Point(3,7);
        Point pointC=new Point(6,0);

        Triangle triangle = new Triangle(pointA,pointB,pointC);
//        System.out.println("Perimeter: "+triangle.getPerimeter());
        triangle.printPerimeter();

        new Triangle(
                new Point(3,7),
                new Point(4,9),
                new Point(2,0))
                .printPerimeter();

        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            new Triangle(
                    new Point(random.nextInt(100),random.nextInt(100)),
                    new Point(random.nextInt(100),random.nextInt(100)),
                    new Point(random.nextInt(100),random.nextInt(100)))
                    .printPerimeter();

        }

    }

    public static void main2(String[] args) {

        Point pointA=new Point(2,4);
        Point pointB=new Point(3,7);
        Point pointC=new Point(6,0);

//        double distanceAB =pointA.distance(pointB.getX(),pointB.getY());
        double distanceAB =pointA.distance(pointB);
        double distanceBC =pointB.distance(pointC);
        double distanceAC =pointA.distance(pointC);

        double perimeter=distanceAB+distanceAC+distanceBC;

        System.out.println("perimeter: "+perimeter);
    }

    public static void main1(String[] args) {
        int ax = 2;
        int ay = 4;

        int bx = 3;
        int by = 7;

        int cx = 6;
        int cy = 0;

        double distanceAB = Math.sqrt(Math.pow(ax-bx,2)+Math.pow(ay-by,2));
        double distanceBC = Math.sqrt(Math.pow(bx-cx,2)+Math.pow(by-cy,2));
        double distanceAC = Math.sqrt(Math.pow(ax-cx,2)+Math.pow(ay-cy,2));

        double perimeter=distanceAB+distanceAC+distanceBC;

        System.out.println("perimeter: "+perimeter);
    }
}
