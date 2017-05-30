package by.shyrei.triangle.service;

import org.apache.logging.log4j.Logger;
import java.util.regex.Pattern;
import static org.apache.logging.log4j.LogManager.getLogger;


/**
 * Project Triangle
 * Created on 24.05.2017.
 * author Shyrei Uladzimir
 *
 * Класс для примера, так как валидация осуществляется при чтении из файла.
 */
class FileValidator {

    private static final Pattern VALIDATE = Pattern.compile("([1-9]\\d?)\\s((-?[\\d]){2}\\s){2}(-?[\\d]){2}");
    private static final Logger logger = getLogger(FileValidator.class);
   
    boolean validator(String line){
        if (!VALIDATE.matcher(line).matches()) {
                logger.warn("Недопустимая строка: " + line);
                return false;
            }
        return true;
    }
}
