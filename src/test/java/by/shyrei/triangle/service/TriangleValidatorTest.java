package by.shyrei.triangle.service;

import by.shyrei.triangle.entity.Point;
import by.shyrei.triangle.entity.Triangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Shyrei Uladzimir
 */
public class TriangleValidatorTest {

    private TriangleValidator triangleValidator = new TriangleValidator();

    @Test
    public void checkIfExist() throws Exception {
        Point first = new Point(1,1);
        Point second = new Point(2,3);
        Point third = new Point(3,1);
        boolean test = triangleValidator.checkIfExist(first, second, third);
        Assert.assertTrue("Точки лежат на одной прямой", test);
    }
    @Test
    public void checkNotExist() throws Exception {
        Point first = new Point(-1,1);
        Point second = new Point(1,1);
        Point third = new Point(2,1);
        boolean test = triangleValidator.checkIfExist(first, second, third);
        Assert.assertFalse("Точки не лежат на одной прямой", test);
    }

    @Test
    public void checkIfRectangular() throws Exception {
        Point first = new Point(1,1);
        Point second = new Point(1,4);
        Point third = new Point(4,1);
        Triangle triangle = new Triangle(1, first, second, third );
        boolean test = triangleValidator.checkIfRectangular(triangle);
        Assert.assertTrue("Треугольник не прямой", test);
    }

}