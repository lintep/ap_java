package src.ir.znu.ap.section12;



import java.util.Random;

public class MyMatrix {
    private int[][] matrix;
    private Random random = new Random();

    public MyMatrix(int rowCount, int colCount) {
        this.matrix=new int[rowCount][colCount];
    }

    public void setRandomValue(){
        int i = this.random.nextInt(matrix.length);
        int j = this.random.nextInt(matrix[0].length);

        this.matrix[i][j]= random.nextInt(1000);
    }

    public void print(){
//        System.out.println("_________________");
//        for (int k1 = 0; k1 < matrix.length; k1++) {
//            for (int k2 = 0; k2 < matrix[0].length; k2++) {
//                System.out.print(matrix[k1][k2]+"\t");
//            }
//            System.out.println();
//        }
        System.out.println(this.toString());
    }

    public void printMatrix() {
        System.out.println(this);
    }

    @Override
    public String toString() {
//        this.print();
//        return "MyMatrix{"+super.toString()+"}";

//        String x = this.print();
//        return x;

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
