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
public class TriangleCalculationTest {

    private TriangleCalculation triangleCalculation = new TriangleCalculation();

    @Test
    public void triangleSquare() throws Exception {
        Point first = new Point(0,0);
        Point second = new Point(0,4);
        Point third = new Point(4,0);
        Triangle triangle = new Triangle(1, first, second, third );
        double actual = Math.round(triangleCalculation.triangleSquare(triangle));
        double expected = 8;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void trianglePerimeter() throws Exception {
        Point first = new Point(0,0);
        Point second = new Point(1,1);
        Point third = new Point(2,0);
        Triangle triangle = new Triangle(1, first, second, third );
        double actual = Math.round(triangleCalculation.trianglePerimeter(triangle));
        double expected = 5;
        Assert.assertEquals(expected,actual,0);
    }

}