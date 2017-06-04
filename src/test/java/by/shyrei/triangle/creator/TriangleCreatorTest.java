package by.shyrei.triangle.creator;

import by.shyrei.triangle.entity.Point;
import by.shyrei.triangle.entity.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

/**
 * Project Triangle
 * Created on 29.05.2017.
 * author Shyrei Uladzimir
 */
@RunWith(Parameterized.class)
public class TriangleCreatorTest {

    private String line;
    private int id;
    private static Point one;
    private static Point two;
    private static Point three;

    public TriangleCreatorTest(String line, int id, Point one, Point two, Point three) {
        this.line = line;
        this.id = id;
        TriangleCreatorTest.one = one;
        TriangleCreatorTest.two = two;
        TriangleCreatorTest.three = three;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                {"1 -1-1 2-2 33", 1, new Point(-1,-1), new Point(2,-2), new Point(3,3)},
                {"2 -7-2 55 08", 2, new Point(-7,-2), new Point(5,5), new Point(0,8)},
                {"5 00 -72 97", 5, new Point(0,0), new Point(-7,2), new Point(9,7)}
        });
    }

    @Test
    public void createTriangle() throws Exception {
        TriangleCreator triangleCreator = new TriangleCreator();
        Triangle expected = new Triangle(id, one, two, three);
        Triangle actual = triangleCreator.createTriangle(line);
        Assert.assertEquals(expected, actual);
    }
}