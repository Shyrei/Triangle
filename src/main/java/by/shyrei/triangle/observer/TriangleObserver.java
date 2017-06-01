package by.shyrei.triangle.observer;

import by.shyrei.triangle.entity.Storage;
import by.shyrei.triangle.entity.Triangle;
import by.shyrei.triangle.entity.TriangleData;
import by.shyrei.triangle.service.TriangleCalculation;

import java.util.ArrayList;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Shyrei Uladzimir
 */
public class TriangleObserver implements Observer {

    private ArrayList<Triangle> list = new ArrayList<>();

    @Override
    public void handleEvent(TriangleEvent event) {
        Triangle triangle = event.getSource();
        TriangleCalculation triangleCalculation = new TriangleCalculation();
        double square = triangleCalculation.triangleSquare(triangle);
        double perimeter = triangleCalculation.trianglePerimeter(triangle);
        TriangleData data = new TriangleData(square, perimeter);
        Storage.getInstance().setData(triangle.getTriangleId(), data);
    }

    public void addObservable(Triangle triangle) {
        list.add(triangle);
    }

    public void removeObservable(Triangle triangle) {
        list.remove(triangle);
    }
}
