package by.shyrei.triangle.observer;

import by.shyrei.triangle.entity.Triangle;
import by.shyrei.triangle.entity.TriangleData;
import by.shyrei.triangle.service.TriangleCalculation;

import java.util.ArrayList;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Uladzimir
 */
public class TriangleObserver implements Observer {

    private ArrayList<Triangle> list = new ArrayList<>();

    @Override
    public void handleEvent(TriangleEvent event) {
        Triangle triangle = (Triangle) event.getSource();
        TriangleCalculation calc = new TriangleCalculation();
        double square = calc.triangleSquare(triangle);
        double perimeter = calc.trianglePerimeter(triangle);
        TriangleData data = new TriangleData(square, perimeter);
        String id = String.valueOf(triangle.getId());
        Storage.map.put(id, data);
    }

    public void addObservable(Triangle triangle) {
        list.add(triangle);
    }

    public void removeObservable(Triangle triangle) {
        list.remove(triangle);
    }
}
