package src.ir.znu.ap.section12;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        MyMatrix myMatrix = new MyMatrix(5,5);
//        myMatrix.print();
//        myMatrix.setRandomValue();
//        myMatrix.print();
//        myMatrix.setRandomValue();
//        myMatrix.print();
//        System.out.println("Operation complete.");

        MyFileMatrix myMatrix = new MyFileMatrix(5,5, "myFile");
        myMatrix.print();
        myMatrix.setRandomValue();
        myMatrix.print();
        myMatrix.setRandomValue();
        myMatrix.print();
        myMatrix.closeFile();
        System.out.println("Operation complete.");

    }

    public static void main4(String[] args) throws FileNotFoundException {
//
////        int x=2;
////        System.out.println("0\t0\n
////                            0\t0");
//
//
////        String str="0\t0\t0\n";// +
////                   "0\t0\t0\n" +
////                   "0\t0\t0";
////        System.out.println(str);
//
//        int x=3;
//        String str="";
//        for (int j = 0; j < x; j++) {
//            for (int i = 0; i < x; i++) {
//                str+="0\t";
//            }
////            System.out.println(str);
////            System.out.println();
//            str+="\n";
//        }
//        System.out.println("___________________");
//        System.out.println(str);

        PrintWriter printWriter = new PrintWriter("out.txt");

        MyMatrix MyMatrix = new MyMatrix(5,5);
        String out = MyMatrix.toString();
        printWriter.println(out);
        MyMatrix.setRandomValue();
        printWriter.println(MyMatrix.toString());

        printWriter.close();
        System.out.println("Operation complete.");
    }

    public static void main3(String[] args) throws FileNotFoundException {
//        Object
        PrintWriter printWriter = new PrintWriter("out.txt");
//        printWriter.println("hi");
//        printWriter.close();

        MyMatrix MyMatrix = new MyMatrix(5,5);
//        System.out.println(myMatrix.toString());
//        System.out.println(myMatrix);
//        myMatrix.print();
//        System.out.println("%%%%%%%%%%%%%%%%%%");
        String out = MyMatrix.toString();
        printWriter.println(out);
        printWriter.close();
        System.out.println("Operation complete.");
////        myMatrix.toStringPrint();
//        System.out.println("out:\n"+out);
//
////        myMatrix.print();
////        myMatrix.setRandomValue();
////        myMatrix.print();
////        myMatrix.setRandomValue();
////        myMatrix.print();
    }

    public static void main2(String[] args) {
        Random random = new Random();

        int[][] matrix=new int[3][4];
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        int i = random.nextInt(matrix.length);
        int j = random.nextInt(matrix[0].length);

        matrix[i][j]= random.nextInt(1000);

        System.out.println("_________________");
        for (int k1 = 0; k1 < matrix.length; k1++) {
            for (int k2 = 0; k2 < matrix[0].length; k2++) {
                System.out.print(matrix[k1][k2]+"\t");
            }
            System.out.println();
        }
//        int[][] matrix2=new int[3][];
//        matrix2[0]=new int[2];
//        matrix2[1]=new int[5];
//        matrix2[2]=new int[3];
//        matrix[2][0]=3;

//        System.out.println(matrix.length);
//        for (int i = 0; i < matrix.length; i++) {
//
//        }

    }

    public static void main1(String[] args) {
        int[] myArray1 = new int[5];
        myArray1[0]=5;
        myArray1[1]=4;
        myArray1[2]=8;
        myArray1[3]=1;
        myArray1[4]=2;

        int[] myArray2 = new int[]{5,4,8,1,2};

        for (int i = 0; i < myArray1.length; i++) {
            System.out.print(myArray1[i]+" ");
        }

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int maxRandomValue=100;
        int count=10;
        System.out.println("\nEnter count [MaxRandomValue]: ");
//        int count= scanner.nextInt();
        String line;
        Random random = new Random();

        if (random.nextBoolean()){
            line=scanner.nextLine();
            System.out.println("scanner");
        }
        else{
            line=scanner2.nextLine();
            System.out.println("scanner2");
        }

        String[] split = line.split(" |,");
        count = Integer.parseInt(split[0]);
        if(split.length==2) {
            maxRandomValue = Integer.parseInt(split[1]);
        }

        int[] myArray3 = new int[count];
        for (int i = 0; i < myArray3.length; i++) {
            myArray3[i]=random.nextInt(maxRandomValue);
        }

        int temp=myArray3[0];
        myArray3[0]=myArray3[myArray3.length-1];
        myArray3[myArray3.length-1]=temp;

        for (int i = 0; i < myArray3.length; i++) {
            System.out.print(myArray3[i]+"\t");
        }
    }
}
