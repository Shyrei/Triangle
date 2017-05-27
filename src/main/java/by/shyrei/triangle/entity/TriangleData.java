package by.shyrei.triangle.entity;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Uladzimir
 */
public class TriangleData {

    double square;
    double perimeter;

    public TriangleData(double square, double perimeter) {
        this.square = square;
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "TriangleData{" +
                "square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}
