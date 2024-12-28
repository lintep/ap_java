package src.ir.znu.ap.scrapper;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Fetcher {

    public static void fetchAndSave(String url, String saveFileAddress,UrlType urlType) throws IOException {

        switch (urlType){
            case HTML: {
                fetchAndSaveHtml(url,saveFileAddress);
                break;
            }
            case IMAGE: {
                fetchAndSaveImage(url,saveFileAddress);
                break;
            }
            default:
        }

//        switch (urlType){
//            case HTML -> fetchAndSaveHtml(url,saveFileAddress);
//            case IMAGE -> fetchAndSaveImage(url,saveFileAddress);
//            default -> {}
//        }

    }

    public static void doFetchWithRetry(String url, String saveFileAddress, UrlType urlType,int retryCount) throws IOException {
        for (int i = 0; i < retryCount; i++) {
            try {
                fetchAndSave(url,saveFileAddress,urlType);
                break;
            } catch (IOException e) {
                if (i == retryCount - 1)
                    throw new RuntimeException(e);
            }
        }
    }

    private static ArrayList<String> fetchAndSaveHtml(String url, String htmlFileAddress) throws IOException {
        ArrayList<String> result=new ArrayList<>();
        Scanner scanner = new Scanner(new URL(url).openStream());
//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(new File("c:/test"));

        PrintWriter printWriter = new PrintWriter(htmlFileAddress);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            printWriter.println(line);
            result.add(line);
        }
        printWriter.close();
        scanner.close();
        System.out.println("Download complete [Url: "+url+"].");
        return result;
    }

    private static void fetchAndSaveImage(String imageUrl, String destinationFile) throws IOException {
        URL url = new URL(imageUrl);
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream(destinationFile);

        byte[] b = new byte[2048];
        int length;

        while ((length = is.read(b)) != -1) {
            os.write(b, 0, length);
        }

        is.close();
        os.close();
    }
}
