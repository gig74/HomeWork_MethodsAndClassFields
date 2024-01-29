package com.example.circle;
/**
 * Заполните этот класс в соответсвии с заданием из лекции.
 */
public class Circle {
    private double radius;
    public Circle(double radius) {
        setRadius( radius ); // Для дополнительной логики в сеттере
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Неверное значение радиуса");
        }
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI ;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
