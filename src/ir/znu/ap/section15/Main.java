package src.ir.znu.ap.section15;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        znu.ap.Main.printHi("Alireza");
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if(line.equals("main1"))
            main1(args);
        else
            main2(args);
    }

    public static void main2(String[] args) {

        ArrayList<Shape> shapeList = new ArrayList<>();

        Circle circle = new Circle(5);
        shapeList.add(circle);

        Shape shape = new Circle(5);
        shapeList.add(shape);


        shapeList.add(new Circle(5));

        shapeList.add(new Rectangle(4,5.6));

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
//            shapeList.add(new Circle(random.nextDouble(1.0,10.5)));
            shapeList.add(new Circle(i+1));
        }

        for (int i = 0; i < 1000; i++) {
            double w = random.nextDouble(1.0, 10.5);
            double l = random.nextDouble(1.0, 10.5);
            shapeList.add(new Rectangle(w,l));
        }

        double sumArea=0;
        for (Shape shapeItem : shapeList) {
            sumArea += shapeItem.getArea();
        }
        System.out.println("sumArea: "+sumArea);
    }

    public static void main1(String[] args) {
//        Circle shape = new Shape();
        Shape shape = new Circle(23.5);
//        Shape shape = new Rectangle(4.5,7.3);
//        Shape shape = new Shape();
        double area = shape.getArea();
        if(shape instanceof Circle){
            System.out.print("Circle ");
        }
        else if (shape instanceof Rectangle){
//            type casting
//            long x=32;
//            int d = (int) x;

            boolean isSquare = ((Rectangle) shape).isSquare();
            System.out.print("Rectangle["+isSquare+"] ");
        }
        else {
            System.out.print("Shape ");
        }
        System.out.println("area: "+area);
    }
}
