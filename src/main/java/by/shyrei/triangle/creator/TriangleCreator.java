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
 * author Shyrei Uladzimir
 */
public class TriangleCreator {

    private TriangleValidator triangleValidator = new TriangleValidator();

    public Triangle createTriangle(String line) throws IncorrectPointException {
        int id = Integer.parseInt(line.substring(0, line.indexOf(" ")));
        String point = line.substring(line.indexOf(" "), line.length()).trim();
        Pattern patern = Pattern.compile("-?[\\d]");
        Matcher matcher = patern.matcher(point);
        ArrayList<Integer> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(Integer.parseInt(matcher.group()));
        }
        Point one = new Point(list.get(0), list.get(1));
        Point two = new Point(list.get(2), list.get(3));
        Point three = new Point(list.get(4), list.get(5));
        if (!triangleValidator.checkIfExist(one, two, three)) {
            throw new IncorrectPointException("Кординаты " + list.toString() + " лежат на одной прямой");

        } return new Triangle(id, one, two, three);
    }
}
