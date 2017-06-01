package by.shyrei.triangle.reader;
import org.apache.logging.log4j.Level;
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
 * author Shyrei Uladzimir
 */
public class LineFileReader {

    private static Logger logger = LogManager.getLogger(LineFileReader.class);
    private static final Pattern VALIDATE = Pattern.compile("([1-9]\\d?)\\s((-?[\\d]){2}\\s){2}(-?[\\d]){2}");

    public ArrayList<String> lineReader(String path) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            Files.readAllLines(Paths.get(path) , StandardCharsets.UTF_8).stream().filter((String line) ->VALIDATE.matcher(line).matches()).forEach(lines::add);
        } catch (IOException e) {
            logger.log(Level.ERROR, "Ошибка с файлом: " + e.getMessage());
        }
        return lines;
    }

    //Вы просили оставить этот метод.
   /* public ArrayList<String> lineReader(String path) {
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
    }*/
}

