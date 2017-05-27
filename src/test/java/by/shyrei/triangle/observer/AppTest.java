package by.shyrei.triangle.observer;

import by.shyrei.triangle.entity.Point;
import by.shyrei.triangle.entity.Triangle;
import by.shyrei.triangle.entity.TriangleData;
import by.shyrei.triangle.service.TriangleCalculation;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Uladzimir
 */
public class AppTest {
    @Test
    public void run() throws Exception {
        Point first = new Point(0,0);
        Point second = new Point(0,4);
        Point third = new Point(4,0);
        Triangle triangle = new Triangle(1, first, second, third );
        TriangleObserver triangleObserver = new TriangleObserver();
        triangle.addObserver(triangleObserver);
        TriangleCalculation triangleCalculation = new TriangleCalculation();
        double square = triangleCalculation.triangleSquare(triangle);
        double perimeter = triangleCalculation.trianglePerimeter(triangle);
        TriangleData triangleData = new TriangleData(square,perimeter);
        Storage storage = new Storage();
        String id = String.valueOf(triangle.getId());
        storage.setData(id, triangleData);
        System.out.println(storage.map.entrySet());
        Point test = new Point(-1, 0);
        triangle.changeFirstPoint(test);
        System.out.println("После изменения1 : ");
        System.out.println(storage.map.entrySet());
        Point test2 = new Point(-3, 0);
        triangle.changeFirstPoint(test2);
        System.out.println("После изменения2 : ");
        System.out.println(storage.map.entrySet());






    }

}