package by.shyrei.triangle.observer;

import by.shyrei.triangle.entity.Point;
import by.shyrei.triangle.entity.Triangle;
import by.shyrei.triangle.entity.TriangleData;
import by.shyrei.triangle.service.TriangleCalculation;
import org.junit.Assert;
import org.junit.Test;
/**
 * Project Triangle
 * Created on 30.05.2017.
 * author Uladzimir
 */
public class TriangleObserverTest {

    private Point p1 = new Point(0,0);
    private Point p2 = new Point(0,4);
    private Point p3 = new Point(4,0);
    private Triangle triangle = new Triangle(1, p1, p2, p3);
    private TriangleObserver triangleObserver = new TriangleObserver();
    private TriangleCalculation triangleCalculation = new TriangleCalculation();
    private Storage storage = new Storage();

    @Test
    public void handleEvent() throws Exception {
        triangle.addObserver(triangleObserver);
        double s1 = triangleCalculation.triangleSquare(triangle);
        double p1 = triangleCalculation.trianglePerimeter(triangle);
        TriangleData td = new TriangleData(s1,p1);
        String id = String.valueOf(triangle.getId());
        storage.setData(id, td);
        TriangleData unexpected = Storage.map.get(id);

        Point test = new Point(-1, 0);
        triangle.changeFirstPoint(test);
        TriangleData actual = Storage.map.get(id);
        Assert.assertNotEquals(unexpected, actual);
    }
}