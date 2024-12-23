package src.ir.znu.ap.scrapper;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Main {

    static HashMap<String,String> fileNameToUrlMap=new HashMap<>();
    public static void main0(String[] args) throws IOException {
        String imageUrl = "https://www.znu.ac.ir/files/uploaded/headers/znu_logo_fa.png";
        saveImage(imageUrl,"c:/temp/test.png");
    }
    public static void main(String[] args) throws IOException {
        HashSet<String> allUrls= new HashSet<>();
        String url = "https://www.znu.ac.ir/";
        allUrls.add(url);
        String basePath = "C:\\temp\\";
        String htmlFileAddress=basePath+"1.html";
//        String htmlFileAddress="C:/temp/1.html";
        ArrayList<String> htmlLines = fetchHtml(url, htmlFileAddress);
        ArrayList<String> urls = getHttpUrls(htmlLines);

        HashSet<String> uniqueUrls = new HashSet<String>(urls);

        ArrayList<String> nextFetchUrl = new ArrayList<>(uniqueUrls);

        int counter = 1;
        while (nextFetchUrl.size()>0){
            counter++;
            url = nextFetchUrl.remove(0);
            if (allUrls.contains(url))
                continue;
            try {
                htmlLines = fetchHtml(url, basePath + counter + ".html");
                urls = getHttpUrls(htmlLines);
                nextFetchUrl.addAll(urls);
            }
            catch (Exception e){
                System.out.println("ERROR["+url+"]: "+e.getMessage());
            }
        }
        System.out.println("Operation complete.");
    }

    public static ArrayList<String> fetchHtml(String url, String htmlFileAddress) throws IOException {
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
        fileNameToUrlMap.put(htmlFileAddress,url);
        System.out.println("Download complete [Url: "+url+"].");
        return result;
    }

    public static ArrayList<String> getHttpUrls(ArrayList<String> htmlLines){
        ArrayList<String> urls=new ArrayList<>();
        for (String htmlLine : htmlLines) {
            if (htmlLine.indexOf("<a href=\"http")>=0) {
                String[] split = htmlLine.split("<a href=\"http");
                for (String s : split) {
                    if(s.indexOf("</a>")>=0 && s.indexOf("://")>=0){
                        int endIndex = s.indexOf("\"");
                        urls.add("http"+s.substring(0,endIndex));
                    }
                }
            }
        }
        return urls;
    }

    public static void saveImage(String imageUrl, String destinationFile) throws IOException {
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
