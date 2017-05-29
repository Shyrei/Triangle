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

    private FileValidator fileValidator = new FileValidator();

    @Test
    public void correctLine() throws Exception {
        boolean test = fileValidator.validator("1 -12 21 31");
        Assert.assertTrue("Ошибка в строке", test);
    }

    @Test
    public void incorrectLine() throws Exception {
        boolean test = fileValidator.validator("1s -1f 00 52");
        Assert.assertFalse("Ошибка в строке", test);
    }

}