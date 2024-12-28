package src.ir.znu.ap.scrapper;

import java.io.IOException;
import java.util.*;

public class DomainDownloader {

    private String domainUrl;
    private String savePath;
    private final int RETRY_COUNT=5;


    HashMap<String,String> fileNameToUrlMap=new HashMap<>();
    HashMap<String,String> urlToFileNameMap=new HashMap<>();


    private Queue<String> nextFetchUrlQueue = new LinkedList<>();


    public DomainDownloader(String domainUrl, String savePath) {
        this.domainUrl = domainUrl;
        this.savePath = savePath;
    }

    public void startDownload() throws IOException {
        String fileAddress = savePath + "0.html";
        Fetcher.doFetchWithRetry(domainUrl,fileAddress,UrlType.HTML,RETRY_COUNT);
        this.fileNameToUrlMap.put(fileAddress,domainUrl);
        this.urlToFileNameMap.put(domainUrl,fileAddress);
        startFetchAndSaveLoop();
    }

    private void startFetchAndSaveLoop(){
        int counter = 1;
        while (nextFetchUrlQueue.size()>0){
            counter++;
            String url = nextFetchUrlQueue.remove();
            if (urlToFileNameMap.containsKey(url))
                continue;
            try {
                String fileAddress = savePath + counter + ".html";
                Fetcher.doFetchWithRetry(domainUrl,fileAddress,UrlType.HTML,RETRY_COUNT);
                List<String> htmlLines = FileReader.getLines(fileAddress);
                List<String> urls = HtmlParser.getHttpUrls(htmlLines);
                nextFetchUrlQueue.addAll(urls);
            }
            catch (Exception e){
                System.out.println("ERROR["+url+"]: "+e.getMessage());
            }
        }
        System.out.println("Operation complete.");
    }
}
