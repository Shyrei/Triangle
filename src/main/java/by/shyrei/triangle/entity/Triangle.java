package by.shyrei.triangle.entity;

import by.shyrei.triangle.observer.TriangleEvent;
import by.shyrei.triangle.observer.TriangleObserver;

/**
 * Project Triangle
 * Created on 24.05.2017.
 * author Shyrei Uladzimir
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;
    private int triangleId;
    private TriangleObserver observer;

    public Triangle(int triangleId, Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.triangleId = triangleId;
    }

    public void setFirst(Point first) {
        this.first = first;
        notifyObservers();
    }

    public void setSecond(Point second) {
        this.second = second;
        notifyObservers();
    }

    public void setThird(Point third) {
        this.third = third;
        notifyObservers();
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    public Point getThird() {
        return third;
    }

    public int getTriangleId() {
        return triangleId;
    }

    public void addObserver(TriangleObserver observer) {
        this.observer = observer;
        observer.addObservable(this);
    }
    public void removeObserver() {
        observer.removeObservable(this);
        observer = null;
    }
    private void notifyObservers() {
        if(observer != null) {
            observer.handleEvent(new TriangleEvent(this));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (getTriangleId() != triangle.getTriangleId()) return false;
        if (getFirst() != null ? !getFirst().equals(triangle.getFirst()) : triangle.getFirst() != null) return false;
        if (second != null ? !second.equals(triangle.second) : triangle.second != null) return false;
        return third != null ? third.equals(triangle.third) : triangle.third == null;
    }

    @Override
    public int hashCode() {
        int result = getFirst() != null ? getFirst().hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        result = 31 * result + getTriangleId();
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", triangleId=" + triangleId +
                '}';
    }
}
