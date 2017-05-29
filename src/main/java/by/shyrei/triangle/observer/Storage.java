package by.shyrei.triangle.observer;

import by.shyrei.triangle.entity.TriangleData;
import java.util.HashMap;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Uladzimir
 */
public class Storage {

    public static HashMap<String, TriangleData> map = new HashMap<>();

    public void setData(String id, TriangleData data){
        map.put(id, data);
    }
}
