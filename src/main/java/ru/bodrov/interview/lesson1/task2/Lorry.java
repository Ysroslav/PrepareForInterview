package ru.bodrov.interview.lesson1.task2;

class Lorry extends Car{//, Moveable, Stopable{ //ошибка интерфейсы не наследуются

    @Override // обязательный метод, так как класс наследуется от Car
    void open(){
        System.out.println("Lorry is open");
    }

    public void move(){
        System.out.println("Lorry is moving");
    }

    public void stop(){
        System.out.println("Lorry is stopping");
    }
}
