package by.shyrei.triangle.service;

import by.shyrei.triangle.entity.Point;
import by.shyrei.triangle.entity.Triangle;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Uladzimir
 */
public class TriangleValidator {

    boolean checkIfExist(Point first, Point second, Point third) {
        return (first.getX() - third.getX()) * (second.getY() - third.getY()) - (second.getX() - third.getX()) * (first.getY() - third.getY()) != 0;
    }

    public boolean checkIfRectangular(Triangle triangle) {
        double x1 = triangle.getFirst().getX();
        double x2 = triangle.getSecond().getX();
        double x3 = triangle.getThird().getX();
        double y1 = triangle.getFirst().getY();
        double y2 = triangle.getSecond().getY();
        double y3 = triangle.getThird().getY();
        double a = Math.sqrt( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double b = Math.sqrt( Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt( Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        return ((a == Math.sqrt((Math.pow(b, 2) + Math.pow(c, 2))) || (b == Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2))) || (c == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)))));
    }


}
