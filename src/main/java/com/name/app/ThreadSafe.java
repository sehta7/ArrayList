package com.name.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ola Podorska
 */
class ThreadSafe implements Runnable{

    List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());
    List<Integer> notSynchronizedList = new ArrayList<>();

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
        for (int i = 0; i < 20; i++){
            System.out.println("My name is: " + Thread.currentThread().getName());
            notSynchronizedList.add(i);
            System.out.println(notSynchronizedList.get(i));
        }
    }
}
