package ru.bodrov.interview.lesson1.task3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColorBackground("Red");
        circle.setWidthLine(2);
        circle.setColorBorder("Green");

        circle.draw();
        circle.delete();

        Rectangle rectangle = new Rectangle();
        rectangle.setColorBackground("Red");
        rectangle.setWidthLine(2);
        rectangle.setColorBorder("Green");

        rectangle.draw();
        rectangle.delete();

    }
}
