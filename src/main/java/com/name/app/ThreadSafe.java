package com.name.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Ola Podorska
 */
class ThreadSafe implements Runnable{

    static List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());
    static List<Integer> notSynchronizedList = new ArrayList<>();
    int toAdd = 0;

    public static void main(String[] args) {
        Thread first = new Thread(new ThreadSafe(), "first");
        Thread second = new Thread(new ThreadSafe(), "second");
        Thread third = new Thread(new ThreadSafe(), "third");
        first.start();
        second.start();
        third.start();
    }

    @Override
    public void run() {
        while(toAdd < 10){
            toAdd++;
            int add = new Random().nextInt(10);
            System.out.println(Thread.currentThread().getName() + " get " + add);
            if (!synchronizedList.contains(add)) {
                try {
                    Thread.sleep(2000);
                    synchronizedList.add(add);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " has: " + synchronizedList);
        }
    }
}
