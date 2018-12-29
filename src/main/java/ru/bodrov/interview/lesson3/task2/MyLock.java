package ru.bodrov.interview.lesson3.task2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock implements Runnable{

    private int counter = 0;
    private Lock lock;

    public MyLock(){
        this.lock = new ReentrantLock();
    }

    public void run(){
        try{
            while(true)
            if(lock.tryLock(10, TimeUnit.SECONDS)){
                counter++;
                System.out.println(counter);
            }
        } catch (InterruptedException e){
            e.fillInStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
