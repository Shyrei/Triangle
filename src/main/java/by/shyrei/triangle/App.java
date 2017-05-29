package by.shyrei.triangle;

import by.shyrei.triangle.creator.TriangleCreator;
import by.shyrei.triangle.entity.Triangle;
import by.shyrei.triangle.entity.TriangleData;
import by.shyrei.triangle.exception.IncorrectPointException;
import by.shyrei.triangle.observer.Storage;
import by.shyrei.triangle.reader.FileReader;
import by.shyrei.triangle.service.TriangleCalculation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Uladzimir
 */
class App {

    private FileReader fileReader = new FileReader();
    private TriangleCreator triangleCreator = new TriangleCreator();
    private TriangleCalculation triangleCalculation = new TriangleCalculation();
    private Storage storage = new Storage();
    private static Logger logger = LogManager.getLogger(TriangleCreator.class);


    void runApp(String filePath) {
        ArrayList<String> lines = fileReader.reader(filePath);
        for (String line: lines) {
            try {
                Triangle triangle = triangleCreator.createTriangle(line);
                String id = Integer.toString(triangle.getId());
                double square = triangleCalculation.triangleSquare(triangle);
                double perimeter = triangleCalculation.trianglePerimeter(triangle);
                TriangleData triangleData = new TriangleData(square, perimeter);
                storage.setData(id, triangleData);
            } catch (IncorrectPointException e) {
                logger.warn(e.getMessage());
            }
        }
    }
}
