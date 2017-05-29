package by.shyrei.triangle.creator;

import by.shyrei.triangle.entity.Point;
import by.shyrei.triangle.entity.Triangle;
import by.shyrei.triangle.exception.IncorrectPointException;
import by.shyrei.triangle.service.TriangleValidator;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project Triangle
 * Created on 29.05.2017.
 * author Uladzimir
 */
public class TriangleCreator {

    private TriangleValidator triangleValidator = new TriangleValidator();

    public Triangle createTriangle(String line) throws IncorrectPointException {
        String[] s = line.split("\\s");
        String point = s[1].concat(s[2]).concat(s[3]);
        Pattern pater = Pattern.compile("-?[\\d]");
        Matcher m = pater.matcher(point);
        ArrayList<Integer> list = new ArrayList<>();
        while (m.find()) {
            list.add(Integer.parseInt(m.group()));
        }
        Point one = new Point(list.get(0), list.get(1));
        Point two = new Point(list.get(2), list.get(3));
        Point three = new Point(list.get(4), list.get(5));
        if (!triangleValidator.checkIfExist(one, two,three)) {
            throw new IncorrectPointException("Кординаты " + list.toString() + " лежат на одной прямой");
        } return new Triangle(Integer.parseInt(s[0]), one, two, three);
    }
}
