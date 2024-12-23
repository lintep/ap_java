package src.ir.znu.ap.section12;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class MyFileMatrix {
    private int[][] matrix;
    private Random random = new Random();

    private String filePath;
    private PrintWriter printWriter;

    public MyFileMatrix(int rowCount, int colCount, String filePath) throws FileNotFoundException {
        this.matrix=new int[rowCount][colCount];
        this.filePath = filePath;
        this.printWriter = new PrintWriter(filePath);

    }

    public void setRandomValue(){
        while (true) {
            int i = this.random.nextInt(matrix.length);
            int j = this.random.nextInt(matrix[0].length);

            if (this.matrix[i][j] == 0) {
                this.matrix[i][j] = random.nextInt(1000);
                break;
            }
        }
    }

    public void print() throws FileNotFoundException {

        printWriter.println(this.toString());

    }

    public void closeFile(){
        printWriter.close();
    }

    public void printMatrix() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String str="";
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                str+=this.matrix[i][j]+"\t";
            }
            str+="\n";
        }
        return str;
    }
}
