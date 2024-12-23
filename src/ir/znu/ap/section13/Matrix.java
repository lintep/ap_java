package src.ir.znu.ap.section13;

import java.util.Random;

public class Matrix {

    protected int[][] matrix;

    private boolean printLog =false;

    private int filledCounter=0;
    protected Random random = new Random();

    public Matrix(int rowCount, int colCount) throws Exception {
        if(rowCount<5 || colCount<5)
            throw new Exception("Invalid input");
        this.matrix=new int[rowCount][colCount];
    }

    public int getFilledCounter() {
        return filledCounter;
    }

    public void setPrintLog(boolean printLog) {
        this.printLog = printLog;
    }

    public void setRandomValue() {
//        throw new Exception();
        if(!isFilled()) {
            int nextTryCounter = 0;
            while (true) {
                int i = random.nextInt(matrix.length);
                int j = this.random.nextInt(matrix[0].length);

                if (this.matrix[i][j] == 0) {
                    this.matrix[i][j] = random.nextInt(1000 - 1) + 1;
                    this.filledCounter++;
                    break;
                } else {
                    nextTryCounter++;
                    if (this.printLog)
                        System.out.println("next try[" + nextTryCounter + "]");
                }
            }
        }
        else {
            System.out.println("Operation skipped.");
        }
    }

    private boolean isFilled(){
//        int filledCounter=0;
//        for (int i = 0; i<this.matrix.length; i++) {
//            for (int j = 0; j<this.matrix[0].length; j++) {
//                if(this.matrix[i][j]!=0)
//                    filledCounter++;
//            }
//        }
        if(this.filledCounter>=matrix.length*matrix[0].length)
            return true;
        return false;
    }
    public void setRandomValue(int count){
        for (int i = 0; i < count; i++) {
            if (this.printLog)
                System.out.println("going to set random value["+(i+1)+"]");
            setRandomValue();
            if (this.printLog)
                print();
        }
//        int counter=0;
//        while (true) {
//            int i = random.nextInt(matrix.length);
//            int j = this.random.nextInt(matrix[0].length);
//
//            if (this.matrix[i][j] == 0) {
//                this.matrix[i][j] = random.nextInt(1000);
//                counter++;
//                if(counter==count)
//                    break;
//            }
//        }
    }

    public void printMatrix() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String str="";
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                str+=matrix[i][j]+"\t";
            }
            str+="\n";
        }
        return str;
    }

    public void print(){
        System.out.println(super.toString());
    }
}
