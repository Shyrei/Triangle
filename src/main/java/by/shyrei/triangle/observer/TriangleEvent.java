package by.shyrei.triangle.observer;

import by.shyrei.triangle.entity.Triangle;
import java.util.EventObject;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Uladzimir
 */
public class TriangleEvent extends EventObject {

    public TriangleEvent(Triangle source) {
        super(source);
    }

    @Override
    public Object getSource() {
        return (Triangle) super.getSource();
    }
}
