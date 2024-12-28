package src.ir.znu.ap.scrapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public static List<String> getLines(String fileAddress) throws IOException {
        return Files.lines(Paths.get(fileAddress)).toList();
    }
}
