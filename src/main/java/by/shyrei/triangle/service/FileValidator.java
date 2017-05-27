package by.shyrei.triangle.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Project Triangle
 * Created on 24.05.2017.
 * author Shyrei Uladzimir
 */
public class FileValidator {

    private static final Pattern VALIDATE = Pattern.compile("((-?[\\d]){2}\\s){2}(\\-?[\\d]){2}");
    private static final Logger logger = LogManager.getLogger(FileValidator.class);

    public boolean validator(List<String> lines){
        for (String line: lines) {
            if (!VALIDATE.matcher(line).matches()) {
                logger.error("Недопустимая строка: " + line);
                return false;
            }
        }
        return true;
    }
}
