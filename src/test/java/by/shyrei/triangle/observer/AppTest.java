package by.shyrei.triangle.observer;

import by.shyrei.triangle.entity.Point;
import by.shyrei.triangle.entity.Triangle;
import by.shyrei.triangle.entity.TriangleData;
import by.shyrei.triangle.service.TriangleCalculation;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Uladzimir
 */
public class AppTest {

    Point p1 = new Point(0,0);
    Point p2 = new Point(0,4);
    Point p3 = new Point(4,0);
    Point p4 = new Point(-5,-3);
    Point p5 = new Point(0,0);
    Point p6 = new Point(3,-8);
    Triangle t1 = new Triangle(1, p1, p2, p3);
    Triangle t2 = new Triangle(2, p4, p5, p6);

    @Test
    public void run() throws Exception {

        TriangleObserver triangleObserver = new TriangleObserver();
        TriangleCalculation triangleCalculation = new TriangleCalculation();
        t1.addObserver(triangleObserver);
        t2.addObserver(triangleObserver);
        double s1 = triangleCalculation.triangleSquare(t1);
        double p1 = triangleCalculation.trianglePerimeter(t1);
        double s2 = triangleCalculation.triangleSquare(t2);
        double p2 = triangleCalculation.trianglePerimeter(t2);
        TriangleData td1 = new TriangleData(s1,p1);
        TriangleData td2 = new TriangleData(s2,p2);
        Storage storage = new Storage();

        String id1 = String.valueOf(t1.getId());
        storage.setData(id1, td1);
        String id2 = String.valueOf(t2.getId());
        storage.setData(id2, td2);

        System.out.println(Storage.map.entrySet());

        Point test1 = new Point(-1, 0);
        t1.changeFirstPoint(test1);
        Point test2 = new Point(1, 1);
        t2.changeSecondPoint(test2);

        System.out.println("После изменения1 : ");
        System.out.println(Storage.map.entrySet());

        Point test3 = new Point(15, -15);
        t1.changeThirdPoint(test3);

        System.out.println("После изменения2 : ");
        System.out.println(Storage.map.entrySet());
    }
}