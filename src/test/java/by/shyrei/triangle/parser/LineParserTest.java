package by.shyrei.triangle.parser;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Project Triangle
 * Created on 24.05.2017.
 * author Uladzimir
 */
public class LineParserTest {

    private static final String FILES_PATH = "files//line.txt";
    private LineParser lineParser = new LineParser();

    @Test
    public void parserTest() throws Exception {
        List<String> testLines = lineParser.parser(FILES_PATH);
        Assert.assertTrue("Не удалось прочитать файл", testLines.size() > 0);
    }
}