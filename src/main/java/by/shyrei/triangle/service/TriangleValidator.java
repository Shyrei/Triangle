package by.shyrei.triangle.service;

import by.shyrei.triangle.entity.Point;
import by.shyrei.triangle.entity.Triangle;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Shyrei Uladzimir
 */
public class TriangleValidator {

    public boolean checkIfExist(Point first, Point second, Point third) {

        return (first.getX() - third.getX()) * (second.getY() - third.getY()) - (second.getX() - third.getX()) * (first.getY() - third.getY()) != 0;
    }

    public boolean checkIfRectangular(Triangle triangle) {
        double x1 = triangle.getFirst().getX();
        double x2 = triangle.getSecond().getX();
        double x3 = triangle.getThird().getX();
        double y1 = triangle.getFirst().getY();
        double y2 = triangle.getSecond().getY();
        double y3 = triangle.getThird().getY();
        double a = Math.hypot((x1-x2), (y1-y2));
        double b = Math.hypot((x1-x3), (y1-y3));
        double c = Math.hypot((x2-x3), (y2-y3));
        return ((a == Math.hypot(b,c)) || (b == Math.hypot(a,c)) || (c == Math.hypot(a,b)));
    }
}
