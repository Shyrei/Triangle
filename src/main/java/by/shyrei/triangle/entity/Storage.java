package by.shyrei.triangle.entity;

import java.util.HashMap;

/**
 * Project Triangle
 * Created on 27.05.2017.
 * author Shyrei Uladzimir
 */
public class Storage {

    private final static Storage instance = new Storage();
    private final HashMap<Integer, TriangleData> triangleCharacteristic = new HashMap<>();

    private Storage(){
    }

    public static Storage getInstance(){
        return instance;
    }

    public void setData(Integer id, TriangleData data){
        triangleCharacteristic.put(id, data);
    }

    public TriangleData getTriangleId(Integer id){
       return triangleCharacteristic.get(id);
    }

}
