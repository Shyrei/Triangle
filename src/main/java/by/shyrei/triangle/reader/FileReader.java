package by.shyrei.triangle.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Project Triangle
 * Created on 24.05.2017.
 * author Uladzimir
 */
public class FileReader {

    private ArrayList<String> lines = new ArrayList<>();
    private static Logger logger = LogManager.getLogger(FileReader.class);
    //private static final Pattern VALIDATE = Pattern.compile("((-?[\\d]){2}\\s){2}(-?[\\d]){2}");
    private static final Pattern VALIDATE = Pattern.compile("([1-9]\\d?)\\s((-?[\\d]){2}\\s){2}(-?[\\d]){2}");


    public ArrayList<String> reader(String path) {
        try {
            Files.readAllLines(Paths.get(path) , StandardCharsets.UTF_8).forEach((String line) -> {
                if (VALIDATE.matcher(line).matches()) {
                    lines.add(line);
                } else logger.warn("Ошибка в строке :" + line);
            });
        } catch (IOException e) {
            logger.error("Ошибка с файлом: " + e.getMessage());
        }
        return lines;
    }
}

