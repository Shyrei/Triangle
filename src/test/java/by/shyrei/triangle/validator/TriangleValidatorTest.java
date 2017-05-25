package by.shyrei.triangle.validator;

import by.shyrei.triangle.parser.LineParser;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Project Triangle
 * Created on 25.05.2017.
 * author Uladzimir
 */
public class TriangleValidatorTest {

    private static final String FILES_PATH = "files//line.txt";
    private LineParser lineParser = new LineParser();
    private TriangleValidator triangleValidator = new TriangleValidator();

    @Test
    public void validatorTest() throws Exception {
        List<String> testLines = lineParser.parser(FILES_PATH);
        boolean test = triangleValidator.validator(testLines);
        Assert.assertTrue("Ошибка в строке", test);
    }

}