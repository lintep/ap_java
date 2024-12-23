package src.myproject.stringutil;

import java.util.Random;

public class MainClass {

    public static void main(String[] args) throws Exception {
        Student student1 = new Student(998767654,"ali","rezayi");
        Student student2;
        student2 = new Student(4012343234l,"nima","mohseni");

        Student student3 = new Student(-1,"nima","mohseni");
        Student student4 = new Student(0,"nima","mohseni");
        Student student5 = new Student("nima","mohseni");

        student3.printInfo();

        student1.printInfo();
    }

    public static void main0(String[] args) {
        int[] intArray=new int[10];
        intArray[0]=6;
        intArray[0]=12;

        intArray=new int[3];
//        intArray[0]=4;
        System.out.println(intArray[0]);

        String[] stringArray=new String[5];

//        System.out.println(stringArray[0]);
        String x = stringArray[0];
        System.out.println(x);
//        System.out.println(x.indexOf('a'));

        Random random = new Random();
//        System.out.println(random.nextInt(1000));
//        int size=100;
        int[] myArray=new int[321];
        String s = "ali";
        System.out.println(s.length());
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]=random.nextInt(1000);
        }

        System.out.println("___________");
        for (int i = 0; i < myArray.length; i++) {
//            System.out.print(i+" ");
//            System.out.println(myArray[i]);
            System.out.println(i+" "+myArray[i]);
        }

        int sum=0;
        for (int i = 0; i < myArray.length; i++) {
            sum+=myArray[i];
        }
        System.out.println("sum="+sum);


    }

    public static void main02(String[] args) {
//        main1(args);
        int x;
        Integer y;

//        String s;
//        s="ali";

        String s = "alireza khanmohammadi";

//        System.out.println(s);
//        System.out.println(s.toUpperCase());
//        System.out.println(s.charAt(2));
//        System.out.println(s.indexOf("si"));
//        System.out.println(s.indexOf("al"));
//        System.out.println(s.indexOf("i"));
//        System.out.println(s.contains("si"));
//        System.out.println(s.contains("i"));

//        System.out.println(s.indexOf("a"));
//        System.out.println(s.indexOf("a",0+1));
//        int index = s.indexOf("a", 6 + 1);
//        System.out.println(index);



        int index=-1;
//        while (s.indexOf("a", index + 1)>=0) {
        while (true) {
            index = s.indexOf("a", index + 1);
            if(index<0)
                break;
            System.out.println(index);
        }

        searchPatternInString(s,"a");
        searchPatternInString(s,"ali");
        searchPatternInString("aliraza ahmadi zanjani","an");
        searchPatternInString("mostafa ansari zadeh","an");

        searchPatternInString("aliraza ahmadi zanjani","mostafa ansari zadeh","an");
        String[] inputArray = new String[2];
        inputArray[0]="aliraza ahmadi zanjani";
        inputArray[1]="mostafa ansari zadeh";

        searchPatternInString(inputArray,"an");

        int[] result=searchPatternInStringReturnIndex("aliraza ahmadi zanjani","an");

        String resultString="";
        StringBuilder resultStringBuilder= new StringBuilder();
        for (int result_index : result) {
            if (result_index==-1)
                break;
           resultString += result_index+", ";
           resultStringBuilder.append(result_index+", ");
        }
        resultStringBuilder.setLength(resultStringBuilder.length()-2);

        System.out.println("result: "+resultString.substring(0,resultString.length()-2));
        System.out.println("result: "+resultStringBuilder.toString());
//        double d = distance();
//        System.out.println(distance());
//        distance()
    }


    public static void main1(String[] args) {

        int ax = 2;
        int ay = 4;
        Point a;

        int bx = 3;
        int by = -2;

        int cx;
        Integer cy=8;
        cx = 3;

        Point d=new Point(3,-2);

        d.distance(ax,ay);

        MainClass mainClass;




        double distanceAB = Math.sqrt(Math.pow(ax-bx,2)+Math.pow(ay-by,2));
        double distanceAC = Math.sqrt(Math.pow(ax-cx,2)+Math.pow(ay-cy,2));
        double distanceBC = Math.sqrt(Math.pow(bx-cx,2)+Math.pow(by-cy,2));

        int newDistanceAB = Math.abs(ax - bx) + Math.abs(ay - by);
        int newDistanceAC = Math.abs(ax - cx) + Math.abs(ay - cy);
        int newDistanceBC = Math.abs(bx - cx) + Math.abs(ay - cy);


        System.out.println("distance");
        System.out.println(distanceAC);

        //int[] p => x=p[0]
        /* int[] p => x=p[0] */
        distanceAB = distance(ax,bx,ay,by);
        distanceAC = distance(ax,cx,ay,cy);
        distanceBC = distance(bx,cx,by,cy);

        Point pointA=new Point();
        pointA=new Point();
        Point pointB=new Point();

//
//        pointA.distance(pointB.getX(),pointB.getY());
//        pointB.distance(pointA.getX(),pointA.getY());
////        pointB.distance(pointA);
    }

    public static double distance(int ax, int bx, int ay, int by){
//        return Math.sqrt(Math.pow(ax-bx,2)+Math.pow(ay-by,2));
        return Math.abs(ax - bx) + Math.abs(ay - by);
    }

    public static void searchPatternInString(String[] inputStringArray, String searchString){
        for (int i = 0; i < inputStringArray.length; i++) {
            String inputString = inputStringArray[i];
//            System.out.println("_________________");
//            System.out.println("inputString:" + inputString + "\tsearchString:" + searchString);
//            int index = -1;
//            while (true) {
//                index = inputString.indexOf(searchString, index + 1);
//                if (index < 0)
//                    break;
//                System.out.println(index);
//            }
            searchPatternInString(inputString,searchString);
        }

    }
    public static void searchPatternInString(String inputString, String searchString){
        System.out.println("_________________");
        System.out.println("inputString:"+inputString+"\tsearchString:"+searchString);
//        String s="alireza khanmohammadi";
//        String searchString="a";
        int index=-1;
//        while (s.indexOf("a", index + 1)>=0) {
        while (true) {
            index = inputString.indexOf(searchString, index + 1);
            if(index<0)
                break;
            System.out.println(index);
        }
    }
    public static void searchPatternInString(String inputString1,String inputString2, String searchString){
//        System.out.println("_________________");
//        System.out.println("inputString1:"+inputString1+"\tsearchString:"+searchString);
//        int index=-1;
//        while (true) {
//            index = inputString1.indexOf(searchString, index + 1);
//            if(index<0)
//                break;
//            System.out.println(index);
//        }
        searchPatternInString(inputString1,searchString);

//        System.out.println("inputString:"+inputString2+"\tsearchString:"+searchString);
//        index=-1;
//        while (true) {
//            index = inputString2.indexOf(searchString, index + 1);
//            if(index<0) {
//                break;
//            }
//            System.out.println(index);
//        }
        searchPatternInString(inputString2,searchString);

    }


    public static int[] searchPatternInStringReturnIndex(String inputString, String searchString){
        int[] methodResult=new int[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            methodResult[i]=-1;
        }
        int nextIndex=0;
//        System.out.println("_________________");
//        System.out.println("inputString:"+inputString+"\tsearchString:"+searchString);
        int index=-1;
        while (true) {
            index = inputString.indexOf(searchString, index + 1);
            if(index<0)
                break;
//            System.out.println(index);
            methodResult[nextIndex] = index;
            nextIndex++;
        }

        return methodResult;
    }

    public static void printStudentInfo(long[] id, String[] firstName, String[] lastName) {
        for (int i = 0; i < id.length; i++) {
            printStudentInfo(id[i], firstName[i], lastName[i]);
        }
    }

    public static void printStudentInfo(long id, String firstName, String lastName){
        System.out.println("__________");
        System.out.println("id: "+id);
        System.out.println("firstName: "+firstName);
        System.out.println("lastName: "+lastName);
        System.out.println("__________");

    }

    public static void printStudentInfo(Student student){
        System.out.println("__________");
        System.out.println("id: "+student.getId());
        System.out.println("firstName: "+student.getFirstName());
        System.out.println("lastName: "+student.getLastName());
        System.out.println("__________");

    }
}
