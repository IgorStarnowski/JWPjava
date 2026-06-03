package Zad2;

import org.testng.annotations.Test;

public class FunctionalProgrammingThread {
    public static void main(String[] args) throws  Exception{
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Hello!");
                }
            });
            t1.start();
        Thread t2 = new Thread(()->{
            System.out.println("Hello");
            System.out.println("Hello");
        });
        t2.start();

        Thread t3 = new Thread(()-> System.out.println("hello"));
        t3.start();
        }
    }