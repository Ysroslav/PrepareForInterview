package ru.bodrov.interview.lesson1.task2;

import com.sun.xml.internal.ws.api.pipe.Engine;

abstract class Car implements Moveable, Stopable { // мое мнение необходимо через абстактный класс построить
                                                   // построить реализацию интерфейсов, таким образом в каждом классе
                                                   // неоходимо будер реализовывать методы move() и stop()
    public Engine engine;
    private String color;
    private String name;

    protected void start(){
        System.out.println("Car starting");
    }


    abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
