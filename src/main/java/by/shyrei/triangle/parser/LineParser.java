package by.shyrei.triangle.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Project Triangle
 * Created on 24.05.2017.
 * author Uladzimir
 */
public class LineParser {

    private List<String> lines = new ArrayList<>();
    private static Logger logger = LogManager.getLogger(LineParser.class);

    public List<String> parser(String path) {
        try {
            lines = Files.readAllLines(Paths.get(path) , StandardCharsets.UTF_8);
        } catch (IOException e) {
            logger.error("Ошибка с файлом: " + e.getMessage());
        }
        return lines;
    }
}
