package ru.bodrov.interview.lesson3.task1;

public class MyPlay{

    boolean check = false;

     public synchronized void ping(String name){
         while (!check)
        try{
            wait();
        } catch (InterruptedException e){
            e.fillInStackTrace();
        }
        System.out.println(name + ": - " + "ping");
        check = false;
        notify();
    }

     public synchronized void pong(String name){
         while(check)
         try{
             wait();
         } catch(InterruptedException e){
             e.fillInStackTrace();
         }
         check = true;
         System.out.println(name + ": - " +"pong");
         notify();
    }
}
