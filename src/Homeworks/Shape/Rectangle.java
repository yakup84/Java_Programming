package Homeworks.Shape;

public class Rectangle extends Shape {
    double weight, length;

    @Override
    public double area() {
        return length*weight;
    }
}