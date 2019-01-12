package ru.bodrov.interview.lesson3.task1;

public class Pong implements Runnable{

    private MyPlay play;

    public Pong(MyPlay play) {
        this.play = play;
        new Thread(this, "Two").start();
    }

    public void run() {
        while (true)
            play.pong("Two");
    }
}
