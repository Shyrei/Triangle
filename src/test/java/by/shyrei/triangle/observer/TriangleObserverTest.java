package by.shyrei.triangle.observer;

import by.shyrei.triangle.entity.Point;
import by.shyrei.triangle.entity.Storage;
import by.shyrei.triangle.entity.Triangle;
import by.shyrei.triangle.entity.TriangleData;
import by.shyrei.triangle.service.TriangleCalculation;
import org.junit.Assert;
import org.junit.Test;
/**
 * Project Triangle
 * Created on 30.05.2017.
 * author Shyrei Uladzimir
 */
public class TriangleObserverTest {

    private Point p1 = new Point(0,0);
    private Point p2 = new Point(0,4);
    private Point p3 = new Point(4,0);
    private Triangle triangle = new Triangle(1, p1, p2, p3);
    private TriangleObserver triangleObserver = new TriangleObserver();
    private TriangleCalculation triangleCalculation = new TriangleCalculation();
    private Storage storage = Storage.getInstance();

    @Test
    public void handleEvent() throws Exception {
        triangle.addObserver(triangleObserver);
        double square = triangleCalculation.triangleSquare(triangle);
        double perimeter = triangleCalculation.trianglePerimeter(triangle);
        TriangleData triangleData = new TriangleData(square,perimeter);
        storage.setData(triangle.getTriangleId(), triangleData);
        TriangleData unexpected = storage.getTriangleId(triangle.getTriangleId());

        Point test = new Point(-1, 0);
        triangle.setFirst(test);
        TriangleData actual = storage.getTriangleId(triangle.getTriangleId());
        Assert.assertNotEquals(unexpected, actual);
    }
}