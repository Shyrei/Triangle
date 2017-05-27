package by.shyrei.triangle.service;

import by.shyrei.triangle.reader.FileReader;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Project Triangle
 * Created on 25.05.2017.
 * author Uladzimir
 */
public class FileValidatorTest {

    private static final String FILES_PATH = "files//line.txt";
    private FileReader fileReader = new FileReader();
    private FileValidator fileValidator = new FileValidator();

    @Test
    public void validatorTest() throws Exception {
        List<String> testLines = fileReader.reader(FILES_PATH);
        boolean test = fileValidator.validator(testLines);
        Assert.assertTrue("Ошибка в строке", test);
    }

}