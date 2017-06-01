package by.shyrei.triangle.entity;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Shyrei Uladzimir
 */
public class TriangleData {

    private double square;
    private double perimeter;

    public TriangleData(double square, double perimeter) {
        this.square = square;
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
