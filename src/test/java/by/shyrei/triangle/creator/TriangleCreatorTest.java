package by.shyrei.triangle.creator;

import by.shyrei.triangle.entity.Point;
import by.shyrei.triangle.entity.Triangle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Project Triangle
 * Created on 29.05.2017.
 * author Uladzimir
 */
public class TriangleCreatorTest {

    private TriangleCreator tr = new TriangleCreator();

    @Test
    public void createTriangle() throws Exception {
        String line = "10 -1-1 2-2 33";
        Point one = new Point(-1, -1);
        Point two = new Point(2, -2);
        Point three = new Point(3, 3);
        Triangle actual = new Triangle(10, one, two, three);
        Triangle expected = tr.createTriangle(line);
        Assert.assertEquals(expected, actual);
    }
}