package ru.bodrov.interview.lesson1.task2;

class LightWeightCar extends Car {

    @Override
    void open(){
        System.out.println("Car is open");
    }

    //@Override // метод не переопределяется, представлена реализация метода из интерфейса Moveable
    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("My Car is stopping");
    }
}
