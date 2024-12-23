package src.ir.znu.ap.section13;


public class MatrixConsole extends Matrix{

    public MatrixConsole(int rowCount, int colCount,String saveFileAddress) throws Exception {
        super(rowCount, colCount);
//        load(saveFileAddress);
    }

    public MatrixConsole(int rowCount, int colCount) throws Exception {
        super(rowCount, colCount);
    }

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "____________________\n"+super.toString()+"____________________\n";
    }
}
