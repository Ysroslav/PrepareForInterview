package ru.bodrov.interview.lesson1.task2;

public class Main {
    public static void main(String[] args) {
        Lorry lorry = new Lorry();
        lorry.open();
        lorry.move();
        lorry.stop();

        Car myCar = new LightWeightCar();
        myCar.open();
        myCar.move();
        myCar.stop();

        lorry.setColor("Black");
        System.out.println(lorry.getColor());
        myCar.setColor("Red");
        System.out.println(myCar.getColor());


    }
}
