package src.ir.znu.ap.scrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HtmlParser {

    public static List<String> getHttpUrls(List<String> htmlLines){
//        ArrayList<String> urls=new ArrayList<>();
//        for (String htmlLine : htmlLines) {
//            if (htmlLine.indexOf("<a href=\"http")>=0) {
//                String[] split = htmlLine.split("<a href=\"http");
//                for (String s : split) {
//                    if(s.indexOf("</a>")>=0 && s.indexOf("://")>=0){
//                        int endIndex = s.indexOf("\"");
//                        urls.add("http"+s.substring(0,endIndex));
//                    }
//                }
//            }
//        }
//
//        return urls;
        return htmlLines.stream()
                .filter(line -> line.indexOf("<a href=\"http")>=0)
                .flatMap(line -> Arrays.asList(line.split("<a href=\"http")).stream())
                .filter(s -> (s.indexOf("</a>")>=0 && s.indexOf("://")>=0))
                .map(s -> {
                    int endIndex = s.indexOf("\"");
                    return "http"+s.substring(0,endIndex);
                })
//                .map(s -> "http"+s.substring(0,s.indexOf("\"")))
                .toList();
    }

}
