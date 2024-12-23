package src.ir.znu.ap.section13;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MatrixFile extends Matrix{

    private String filePath;
    private PrintWriter printWriter;

    public MatrixFile(int rowCount, int colCount, String filePath) throws Exception {
        super(rowCount, colCount);
        this.filePath = filePath;
//        loafFromFile(filePath);
        loafFromFile();
        this.printWriter = new PrintWriter(new BufferedWriter(new FileWriter(filePath,true)));

    }

    private void loafFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(this.filePath));
//        int counter=0;
//        while (scanner.hasNext()){
//            scanner.nextLine();
//            counter++;
//        }
//
//        String[] lines= new String[counter];
//        counter=0;
//        while (scanner.hasNext()){
//            lines[counter]=scanner.nextLine();
//            counter++;
//        }
//        scanner.close();

        ArrayList<String> lineList= new ArrayList<>();
        while (scanner.hasNext()){
            lineList.add(scanner.nextLine());
        }
        scanner.close();

        if(lineList.size()>0) {
            int startIndex = lineList.size() - 1;
            while (startIndex > 0 && lineList.get(startIndex).length() != 0) {
                startIndex--;
            }

            if (startIndex == 0)
                startIndex = -1;

            for (int i = 0; i < super.matrix.length; i++) {
//                System.out.println(i);
                String[] split = lineList.get(startIndex + i + 1).split("\t");
                for (int j = 0; j < super.matrix[0].length; j++) {
                    super.matrix[i][j] = Integer.parseInt(split[j]);
                }
            }

        }

    }

    @Override
    public void print() {
        printWriter.println(this.toString());
        printWriter.flush();
        System.out.println("print saved to "+this.filePath);
    }

    public void closeFile(){
        printWriter.close();
    }


    @Override
    public String toString() {
        return "****** "+this.filePath+" *******\n"+super.toString();
    }
}
