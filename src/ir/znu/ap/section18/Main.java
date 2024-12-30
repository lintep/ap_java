package src.ir.znu.ap.section18;

import src.ir.znu.ap.section15.Rectangle;
import src.myproject.stringutil.Student;

import java.util.Arrays;

public class Main {

    public static void main1(String[] args) {
        RectangleComposite rectangleComposite = new RectangleComposite(5,6);
        System.out.println(rectangleComposite);
        System.out.println("area: "+ rectangleComposite.getAllArea());

        System.out.println("_________________");
        RectangleExtend rectangleExtend = new RectangleExtend(5, 6);
        System.out.println(rectangleExtend);
        System.out.println("area: "+ rectangleExtend.getMyArea());

    }

    public static void main(String[] args) throws Exception {
//        Rectangle rectangle = new Rectangle(3,4);
//        System.out.printf("area: "+rectangle.getArea());

//        RectangleWithInterface rectangle = new RectangleWithInterface(3,4);
//        System.out.printf("area: "+rectangle.getArea());

        AreaGetterInterface rectangle = new RectangleWithInterface(3,4);
        System.out.println("area: "+rectangle.getArea());

        System.out.println("_______");
        Student student1=new Student(98485214,"ali","mohammadi");
        Student student2=new Student(97485214,"reza","ahmadi");
        Student[] students=new Student[4];
        students[0]=student1;
        students[1]=student2;
        students[2]=student2;
        students[3]=student1;
//        Arrays.sort(students);

//        Arrays.asList(students).stream().sorted().forEach(System.out::println);
        Arrays.asList(students).stream().sorted((a,b) -> -a.getLastName().compareTo(b.getLastName())).forEach(System.out::println);
    }
}
