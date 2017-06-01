package by.shyrei.triangle.main;

import by.shyrei.triangle.creator.TriangleCreator;
import by.shyrei.triangle.entity.Storage;
import by.shyrei.triangle.entity.Triangle;
import by.shyrei.triangle.entity.TriangleData;
import by.shyrei.triangle.service.TriangleCalculation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

/**
 * Project Triangle
 * Created on 01.06.2017.
 * author Shyrei Uladzimir
 */
@RunWith(Parameterized.class)
public class MainTest {

    private String line;

    public MainTest(String line) {
        this.line = line;

    }
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"1 -55 44 11"},
                {"2 -70 80 4-2"},
                {"3 -55 44 11"},
                {"4 00 0-4 40"}
                });
    }


    private TriangleCreator triangleCreator = new TriangleCreator();
    private TriangleCalculation triangleCalculation = new TriangleCalculation();
    private Storage storage = Storage.getInstance();

    @Test
    public void mainTest() throws Exception {
            Triangle triangle = triangleCreator.createTriangle(line);
            double square = triangleCalculation.triangleSquare(triangle);
            double perimeter = triangleCalculation.trianglePerimeter(triangle);
            TriangleData triangleData = new TriangleData(square, perimeter);
            storage.setData(triangle.getTriangleId(), triangleData);
        }
    }

