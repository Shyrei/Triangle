package by.shyrei.triangle.service;

import by.shyrei.triangle.entity.Triangle;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Uladzimir
 */
public class TriangleCalculation {

    public double triangleSquare(Triangle triangle) {
        double x1 = triangle.getFirst().getX();
        double x2 = triangle.getSecond().getX();
        double x3 = triangle.getThird().getX();
        double y1 = triangle.getFirst().getY();
        double y2 = triangle.getSecond().getY();
        double y3 = triangle.getThird().getY();
        double a = Math.sqrt( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double b = Math.sqrt( Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt( Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

    public double trianglePerimeter(Triangle triangle) {
        double x1 = triangle.getFirst().getX();
        double x2 = triangle.getSecond().getX();
        double x3 = triangle.getThird().getX();
        double y1 = triangle.getFirst().getY();
        double y2 = triangle.getSecond().getY();
        double y3 = triangle.getThird().getY();
        double a = Math.sqrt( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double b = Math.sqrt( Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt( Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        return a + b + c;
    }


}
