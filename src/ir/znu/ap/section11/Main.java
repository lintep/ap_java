package src.ir.znu.ap.section11;

import src.myproject.stringutil.Point;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\User-Kara-Laptop\\IdeaProjects\\hellowworld\\test,txt"));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(line);
            String[] split = line.split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);
            new Point(x,y);
        }
    }

    public static void mainScanner(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        String input;
        while (true) {
            System.out.println("Enter your input:");
            input = scanner.nextLine();
            try {
                count = Integer.parseInt(input);
                break;
            } catch (Exception e) {
//                e.printStackTrace();
                System.out.println("Exception: "+e.getMessage());
            }

        }

        for (int i = 0; i < count; i++) {
            System.out.println("*");
        }
        System.out.println(input);
    }
}
