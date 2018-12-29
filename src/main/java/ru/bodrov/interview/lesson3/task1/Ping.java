package ru.bodrov.interview.lesson3.task1;

public class Ping implements Runnable {

    private MyPlay play;

    public Ping(MyPlay play) {
        this.play = play;
        new Thread(this, "One").start();
    }

    public void run() {
        while (true)
            play.ping("One");
    }
}

