package by.shyrei.triangle.entity;

import by.shyrei.triangle.observer.TriangleEvent;
import by.shyrei.triangle.observer.TriangleObserver;

/**
 * Project Triangle
 * Created on 24.05.2017.
 * author Uladzimir
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;
    private int id; //Спросить как лучше реализовать
    private TriangleObserver observer;

    public Triangle(int id, Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.id = id;
    }

    public void changeFirstPoint(Point first) {
        this.first = first;
        notifyObservers();
    }

    public void changeSecondPoint(Point second) {
        this.second = second;
        notifyObservers();
    }

    public void changeThirdPoint(Point third) {
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

    public int getId() {
        return id;
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

        if (getId() != triangle.getId()) return false;
        if (getFirst() != null ? !getFirst().equals(triangle.getFirst()) : triangle.getFirst() != null) return false;
        if (second != null ? !second.equals(triangle.second) : triangle.second != null) return false;
        return third != null ? third.equals(triangle.third) : triangle.third == null;
    }

    @Override
    public int hashCode() {
        int result = getFirst() != null ? getFirst().hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        result = 31 * result + getId();
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", id=" + id +
                '}';
    }
}
