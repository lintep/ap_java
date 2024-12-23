package src.ir.znu.ap.section13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
//        Matrix matrix = new MatrixFile(8,6,"test.txt");
//        Matrix matrix = new Matrix(8,6);
        Matrix matrix = new MatrixConsole(8,6);
        while (true) {
            System.out.println("Enter input:");
            String line = scanner.nextLine();
            if(line.equals("q"))
                break;
            matrix.setRandomValue();
//            matrixFile.print();//save to file
            matrix.printMatrix();//console
        }
    }

    public static void main3(String[] args) throws Exception {
        MatrixConsole matrixConsole = new MatrixConsole(8,6);
        matrixConsole.print();
        matrixConsole.setPrintLog(false);
        matrixConsole.setRandomValue(500);
        System.out.println(matrixConsole.getFilledCounter());
        matrixConsole.print();
    }

    public static void main2(String[] args) throws Exception {
        MatrixConsole matrixConsole = new MatrixConsole(6,6);
        doMatrix(matrixConsole);

        MatrixFile matrixFile = new MatrixFile(6,6, "test.txt");
        doMatrix(matrixFile);


    }
    public static void main1(String[] args) throws Exception {
        MatrixConsole matrixConsole = new MatrixConsole(6,6);
        matrixConsole.setRandomValue();
        matrixConsole.print();
        matrixConsole.setRandomValue();
        matrixConsole.print();
        matrixConsole.setRandomValue();
        matrixConsole.print();

        MatrixFile matrixFile = new MatrixFile(6,6, "test.txt");
        matrixFile.setRandomValue();
        matrixFile.print();
        matrixFile.setRandomValue();
        matrixFile.print();
        matrixFile.setRandomValue();
        matrixFile.print();

        System.out.println("Operation complete.");
    }

    public static void doMatrix(Matrix matrix) {
        matrix.setRandomValue();
        matrix.print();
        matrix.setRandomValue();
        matrix.print();
        matrix.setRandomValue();
        matrix.print();

        System.out.println("Operation complete.");
    }
}
